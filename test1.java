import java.util.Scanner;

//This program calculates the area of a rectangle


public class test1 {
    public static void main(String[] args) {

        // create a Scanner obeject to get input on the Control borad
        Scanner a = new Scanner(System.in);
        // Declare a double variable 'length' and initialize it to 0
        double length = 0;

        // Loop to get a valid length input from the user
        while(true){
            // Prompt the user to enter the length
            System.out.println("Please give the legnth");
            // Read the user input and assign it to 'length'
            length = a.nextDouble();
            // If the entered length is greater than 0

            if(length > 0){
                // Exit the loop
                break;

            }else if(length <= 0){// If the entered length is less than or equal to 0
                // Ask the user to enter a valid length
                System.out.println("Please give a length greater than 0");
            }
        }

        // Loop to get a valid width in put and calculate the rectangle's area
        while (true) {
            // Prompt the user to enter the width
            System.out.println("Please give the width");
            // Read the user input and assign it to 'width'
            double width = a.nextDouble();

            if (width > 0) { // If the entered width is greater than 0
                // Calculate the area of the rectangle (length * width)
                double area = length * width;
                // Print the calculated area
                System.out.println("The area of this rectangle is " + area);
                break; // Exit the loop
            } else { // If the entered width is less than or equal to 0
                // Ask the user to enter a valid width
                System.out.println("Please give a width greater than 0"); // Ask the user to enter a valid width
            }
        }
    }
}
