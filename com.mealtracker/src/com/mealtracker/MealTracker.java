package com.mealtracker;
import java.util.ArrayList;

public class MealTracker {
	private ArrayList<Meal> meals = new ArrayList<>(); 

    private User consumer;
	    
	  MealTracker(User user){
	    this.consumer = user;
	  }

	  public int getMealCount(){
	     return this.meals.size();
	  }

	  public double getAdherence(){
	    int count = 0;
	    for(Meal meal: this.meals){
	      if(meal.consumed()){
	        count += 1;
	      }
	    }

	    return (double)(count/this.meals.size()) * 100;
	  }

	  public boolean isOnTrack(){
	    return this.getAdherence() >= this.consumer.getTargetAdherence();
	  }

	  public void addMeal(Meal newMeal){
	    this.meals.add(newMeal);
	  }

	  public void viewMeals(){
	    for(Meal meals: this.meals){
	      System.out.println(meals.getName());
	    }
	  }
}
