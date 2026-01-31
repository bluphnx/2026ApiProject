package javaRestAssuredBasics;

import java.util.Arrays;

public class BasicPojoClass {

	private int price;
	private String name;
	private String color;
	private String[] sellerNames;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getSellerNames() {
		return sellerNames;
	}

	public void setSellerNames(String[] sellerNames) {
		this.sellerNames = sellerNames;
	}

	public BasicPojoClass(int price, String name, String color, String[] sellerNames) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
		this.sellerNames = sellerNames;
	}

	@Override
	public String toString() {
		return "BasicPojoClass [price=" + price + ", name=" + name + ", color=" + color + ", sellerNames="
				+ Arrays.toString(sellerNames) + "]";
	}

}
