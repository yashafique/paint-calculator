/*
Assume that a gallon of paint covers about 350 square feet of wall space. 
Create a class called PaintCalculator with a main() method that prompts the user for the length, width, and height of a rectangular room, all three of type double. 
Pass these three values to a method called computeArea() that does the following:

Calculates the wall area for a room
Passes the calculated wall area to another method called computeGallons() that calculates and returns the number of gallons of paint needed
Displays the number of gallons needed
Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon
Returns the price to the main() method
The main() method displays the final price. For example, the cost to paint a 15-by-20-foot room with 10-foot ceilings is $64.

An example of the program is shown below;
main()
Enter the room's length >> 13.2
Enter the room's width >> 10.5
Enter the room's height >> 9.0

You will need 1.2188571428571429 gallons
The price to paint the room is $39.00342857142857
*/


package cengageChapter3_programs;

import java.util.Scanner;
public class programExercise3_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the room's length >> ");
		double length = input.nextDouble();
		System.out.println("Enter the room's width >> ");
		double width = input.nextDouble();
		System.out.println("Enter the room's height >> ");
		double height = input.nextDouble();
		
		
		double area = 2 * (length * height + width * height);
		double areaPerSq = 350;
		
		double gallonsReq = area/areaPerSq;
		
		

        System.out.println("You will need " + gallonsReq + " gallons");
        System.out.println("The price to paint the room is $" + computeArea(length, width, height));
        
        input.close();
    }

    public static double computeArea(double length, double width, double height) {
        double pricePerGallon = 32;
        double area = 2 * (length * height + width * height);
        double price = computeGallons(area) * pricePerGallon;
        return price;
    }

    public static double computeGallons(double area) {
        double areaSqPerGallon = 350;
        return area / areaSqPerGallon;
    }
}







	/*
		 * double area = computeArea(length, width, height); double gallons =
		 * computeGallons(area); double price = gallons * 32;
		 */
		/*
		System.out.println("you will need " + computeArea(length, width, height) + " gallons");
		System.out.println("The price to paint the room is $" + computeArea(length, width, height, price));
		
		
		
		
	}
	
	
	public static double computeArea(double length, double width, double height, double price) {
	    double area = 2 * (length * height + width * height);
	    return (area / computeGallons(area)) * price;
	   
	}
	public static double computeArea(double length, double width, double height) 
	{
	    double area = 2 * (length * height + width * height);
	    return (area / computeGallons(area));
	}
	

	public static double computeGallons(double area) {
		double areaSqPerGallon = 350;
		return area / areaSqPerGallon;
	}	
				
}
*/