import java.util.Scanner;

public class Product {
	private String id;
	private int unit;
	private double price;

	public void setid(String ID) {
		id = ID;
	}

	public String getid() {
		return id;
	}

	public void setUnit(int UNIT) {
		unit = UNIT;
	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) {
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calcilate() {
		return (unit * price);
	}

	public void ListOfProduct(int getUnit) {

		System.out.println(">> " + getid() + " has " + getUnit());

	}

}