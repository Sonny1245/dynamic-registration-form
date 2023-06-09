package org.sonnyjava.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("animalHeart")
	private Heart heart;

	
	/*
	 * public void setHeart(Heart heart) { this.heart = heart; }
	 */

	public void startPumping() {

		if (heart != null) {
			heart.pumpingHeart();
		} else {
			System.out.println("You are a dead man!");
		}

	}

}
