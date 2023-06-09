package org.sonnyjava.autowiring;

public class Heart {

	private String nameOfHeart;
	private int numOfHeart;

	public String getNameOfHeart() {
		return nameOfHeart;
	}

	public void setNameOfHeart(String nameOfHeart) {
		this.nameOfHeart = nameOfHeart;
	}

	public int getNumOfHeart() {
		return numOfHeart;
	}

	public void setNumOfHeart(int numOfHeart) {
		this.numOfHeart = numOfHeart;
	}

	public void pumpingHeart() {

		System.out.println("This is the hear of " + getNameOfHeart());
		System.out.println("And the number of heart is " + getNumOfHeart());
	}

}
