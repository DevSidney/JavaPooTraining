package entities;

import entities.exception.Exceptions;

public class Account {
	private Integer accountNumber;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer accountNumber, String holder, Double balance, Double withdrawLimit) throws Exceptions {
		if (balance < 0 || withdrawLimit < 0) {
			throw new Exceptions("invalid value");
		}
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) throws Exceptions {
		if (amount <= 0) {
			throw new Exceptions("the amount that you need to deposit must be >0");
		} else {
			balance += amount;
		}
	}

	public void withdraw(Double amount) throws Exceptions {
		if (amount <= 0 || amount > balance || amount > withdrawLimit) {
			throw new Exceptions("invalid value");
		} else {
			balance -= amount;
		}
	}
}
