package org.sonnyjava.foodlist;

public class Food {
	
	private long id;
	private String item;
	private double price;
	
	
	public Food(long id, String item, double price) {
		this.id = id;
		this.item = item;
		this.price = price;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
		
}
