package com.mealtracker;

import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		
	    //Create a user
	    User consumer = new User("Abeer","Ishtiaq", "test@example.com", 90);
	    

	    Meal breakfast = new Meal("Breakfast", "2019-15-01 07:30:00");
	    Meal lunch = new Meal("Lunch", "2019-15-01 12:00:00");
	    Meal dinner = new Meal("Dinner", "2019-15-01 19:00:00");
	    Meal afternoonSnack = new Meal("Afternoon Snack", "2019-15-01 17:00:00");

	    MealTracker tracker = new MealTracker(consumer);
	    tracker.addMeal(breakfast);
	    tracker.addMeal(lunch);
	    tracker.addMeal(afternoonSnack);
	    tracker.addMeal(dinner);

	    

	    Food egg = new Food("Egg", Categories.PROTEIN, 0, 0, 13);
	    Food Chicken = new Food("Chicken Breast", Categories.PROTEIN, 4.3, 0, 37); 


	    System.out.println("Calories in egg are: "+egg.getCalories());

	    breakfast.addFood((egg));
	    lunch.addFood(Chicken);

	    System.out.println(tracker.getMealCount());
	    tracker.viewMeals();
	       
	  
	    };
}
