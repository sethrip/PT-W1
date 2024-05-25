package com.promineotech;

public class Application {

	public static void main(String[] args) {
		//this is a comment
		/*
		 * Primitive:
		 * int - an integer
		 * double - decimal places 32.89235
		 * float - precision decimal data type 45.3987
		 * long - like an int, numbers can be higher
		 * short - like an int, less of a number range
		 * byte - 8 bits of data, a bit is 0 or 1
		 * char - a single character - a B a &
		 * boolean - true or false
		 * 
		 * Objects
		 * String - is textual data, a string of characters
		 */
		
		//variable declaration - type, identifier, assignment operator, value, sem-colon
		
		int numberOfFriends;
		int samsAge = 67;
		double accountBalance = 34.67;
		char middleInitial = 'C';     
		boolean isHotOutside = true;
		String firstName = "Sam";
		
		
		System.out.println(samsAge);
		System.out.println(accountBalance);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		
		//operator performs actions on operands
		// + - * / 
		int age = 34 * 2;
		
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		
		System.out.println(68 == 68);
		
		age = age + 1;
		System.out.println(age);
		
		String firstName1 = "Tommy";
		String lastName = "Smith";
		String fullName = firstName1 + " " + lastName; //concatenation
		System.out.println(fullName);
		
		
	
	}

}
