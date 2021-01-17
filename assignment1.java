<<<<<<< HEAD
   
public class assignment1 {

	public static void main(String[] args) {
	    Scanner UserInput = new Scanner(System.in);
		//calculatingPerimeter and area of rectangle
        System.out.println("Rectangle area and perimeter:");

        System.out.println("Input the length: ");
        Float length = UserInput.nextFloat();
    
        System.out.println("Input the width: ");
        Float width = UserInput.nextFloat();

        Float surface = length * width;
        System.out.println("The area is:" + surface);

        Float perimeter = 2*(length+width);
        System.out.println("The perimeter is: " + perimeter);


	}

}
=======
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


>>>>>>> 60b1ff244db145990b689b2be4b73073237eef69
