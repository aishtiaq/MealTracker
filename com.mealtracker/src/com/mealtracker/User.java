package com.mealtracker;

public class User {
	
	private String firstname;
	private String lastname;
	private String email;
	private double targetadherance;

	User(String firstName, String lastName, String email, double adhertargetadheranceance){
		this.firstname = firstName;
		this.lastname = lastName;
		this.email = email;
		this.targetadherance = targetadherance;
	}
	public String getFirstName(){
		return this.firstname;
	}
	public String getLastName(){
		return this.lastname;
	}
	public String getEmail(){
		return this.email;
	}
	public double getTargetAdherence(){
		return this.targetadherance;
	}

}
