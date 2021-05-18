package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (menuSelection !=4) {
			System.out.println("Please select an option" + "\n" + "1.Cup to Teaspoons" + "\n" + "2. Miles to KiloMeters" 
		+ "\n" + "3. US Gallons to Imperial Gallons" + "\n" + "4.Quit");
			
			menuSelection = (int)scan.nextDouble();
			double units;
			switch(menuSelection) {
			case 1:
				System.out.println("first case.");
				units = scan.nextDouble();
				System.out.println(units + " Cups is " + (units * 48) + "Teaspoons");
				break;
			case 2:
				System.out.println("second case.");
				units = scan.nextDouble();
				System.out.println(units + " Miles is " + (units * 1.609) + "KiloMeters");
				break;
			case 3:
				System.out.println("third case.");
				units = scan.nextDouble();
				System.out.println(units + " US Gallons is " + (units * 0.832674) + "Imperial Gallons");
				break;
			case 4:
				System.out.println("Thank You !");
				break;
			default:
				System.out.println("I did not recognize that value");
			}
		}
		
		System.out.println("End of the Program!");
		scan.close();
				
		
	}
}