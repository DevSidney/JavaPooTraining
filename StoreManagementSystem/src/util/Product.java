package util;

public class Product {
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;

	public Product(Integer id, String name, Double price, Integer quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void increaseQuantity(int increase) {
		if (increase >= 0) {
			quantity += increase;
		} else {
			System.out.println("ERROR!");
		}
	}

	public void reduceQuantity(int reduce) {
		if (reduce >= 0 && reduce <= quantity) {
			quantity -= reduce;
		} else {
			System.out.println("ERROR!");
		}
	}

	@Override
	public String toString() {
		return "Product [id= " + id + ", name= " + name + ", price=$" + String.format("%.2f", price) + ", quantity= " + quantity + "]";
	}

}