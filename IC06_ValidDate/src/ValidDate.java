/*
    Nguyen, Nguyen
    CS A170
    02/26/2018

    IC06_ValidDate
*/
import java.util.Scanner;

public class ValidDate {

	public static void main(String[] args) {
		// Variables
		Scanner consoleScanner = new Scanner(System.in);
		DateTimeHelper helper = new DateTimeHelper();
		String inputDate;
		int month, day, year;

		// Get the input from user
		System.out.println("The input date will have the format mm/dd/yyyy.");
		inputDate = consoleScanner.nextLine();
		
		// Close the scanner
		consoleScanner.close();

		try {
			// Parsing
			month = Integer.parseInt(inputDate.substring(0, 2));
			day = Integer.parseInt(inputDate.substring(3, 5));
			year = Integer.parseInt(inputDate.substring(6));

			// Display the result
			System.out.println((helper.isValidDate(month, day, year) ? "Valid date." : "Invalid date."));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}