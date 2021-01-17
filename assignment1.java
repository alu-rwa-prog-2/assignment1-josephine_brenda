<<<<<<< HEAD
Author:josephine
import java.util.Scanner;
public class assignment1 {

	public static void main(String[] args) {
	    Scanner UserInput = new Scanner(System.in);//this wwill all user to input variable
		//calculatingPerimeter and area of rectangle
        System.out.println("Rectangle area and perimeter:");

        System.out.println("Input the length: ");//this will display the missage to show the user that they have to insert lenght
        Float length = UserInput.nextFloat();
    
        System.out.println("Input the width: ");//this will display the missage to show the user that they have to insert lenght
        Float width = UserInput.nextFloat();

        Float surface = length * width;//this will calculate the surface of rectangle
        System.out.println("The area is:" + surface);//this will print the surface of rectangle

        Float perimeter = 2*(length+width);//calculation of perimeter
        System.out.println("The perimeter is: " + perimeter);//this will print the perimeter


	}
}


>>>>>>> 60b1ff244db145990b689b2be4b73073237eef69
