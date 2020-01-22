package lab2;
/*
 * @author jeanniemccarthy
 */
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		String goAgain = "y";
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator");
		while (goAgain.equalsIgnoreCase("y")) {
			System.out.println("Enter Length:");
			length = scnr.nextDouble();
			
			System.out.println("Enter Width:");
			width = scnr.nextDouble();
			
			System.out.println("Enter Height:");
			height = scnr.nextDouble();
			
			area = length * width;
			perimeter = 2* length + 2 * width;
			volume = length * width * height;
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			
			System.out.println("Would you like to repeat for another room? y/n");
			goAgain = scnr.next();
		}
		System.out.println("Thank you. Goodbye!");
		
		
	}
}
