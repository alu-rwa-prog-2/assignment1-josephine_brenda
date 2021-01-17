//Authors: Brenda & Josephine

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner UserInput = new Scanner(System.in);
		
		System.out.println("What is your name? ");
        String name = UserInput.nextLine();
        
        System.out.println("What is your weight? ");
        Float weight = UserInput.nextFloat();
        
        System.out.println("What is your height? ");
	    Float height = UserInput.nextFloat();


	    System.out.println("Name: " + name);
	    System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        
        Float bmi = weight / (height * height);
        System.out.println(name + " , your BMI is " + bmi);
  
	
		
	}

}


