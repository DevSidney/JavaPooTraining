package models.services;

import java.time.LocalDate;

import models.entities.Contract;
import models.entities.Installment;

public class ContractService {
	public void processContract(Contract contract, Integer months) {
		OnlinePaymentService ops = new PaypalService();
		Double installment = contract.getTotalValue() / months;
		for (int i = 0; i < months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i + 1);
			Double amount = installment + ops.interest(installment, i + 1);
			amount += ops.paymentFee(amount);
			contract.getInstallments().add(new Installment(dueDate, amount));
		}
	}
}
