package org.sonnyjava.foodlist;

import java.util.Arrays;
import java.util.List;

public class FoodListDBUtils {
	
	public static List<Food> getFoods(){
		
		return Arrays.asList(new Food(100L, "Pizza", 2.75),
				new Food(101L, "Chicken Wing", 8.34),
				new Food(102L, "Beef Roated", 26.90));
			
	}	

}
