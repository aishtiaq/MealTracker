package com.mealtracker;
import java.util.ArrayList;

public class Food {
	  private double calories;
	  private double fat;
	  private double carbohydrates;
	  private double protein;
	  private String name;
	  private Categories type;

	  private ArrayList <Categories> categories = new ArrayList<>();

	  Food(String name, Categories type, double fat, double carbohydrates,
	        double protein){
	    this.name = name;
	    this.type = type;
	     
	    this.fat = fat;
	    this.carbohydrates = carbohydrates;
	    this.protein = protein;
	    this.calories = calcCalories(fat, carbohydrates, protein);
	     
	  }
	  
	  public String getName(){
	    return this.name;
	  }

	  public double getCalories(){
	    return this.calories;
	  }
	  public double getFat(){
	    return this.fat;
	  }
	  public double getCarbohydrates(){
	    return this.carbohydrates;
	  }
	  public double getProtein(){
	    return this.protein;
	  }

	  public Categories getCategory(){
	    return this.type;
	  }

	  public ArrayList<Categories> getCategories(){
	    return this.categories;
	  }

	  public void addCategory(Categories category ){
	     this.categories.add(category);
	  }
	  
	  //4 calories per gram of carb and protein, 9 per gram of fat
	  private static double calcCalories( double carbohydrates, double fat, double protein){
	      return   4 * carbohydrates + 9 * fat + 4 * protein;  
	  }

	 
}
