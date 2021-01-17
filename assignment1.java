   
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
