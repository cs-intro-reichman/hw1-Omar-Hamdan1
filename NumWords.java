// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int number = Integer.parseInt(System.console().readLine("Enter a number between 0 and 999: "));
		if (number < 0 || number > 999) {
			System.out.println("Number out of range.");
			return;
		}
		int hundreds = number / 100;
		int tens = (number % 100) / 10;
		int units = number % 10;
		System.out.println("The number is: " + hundreds + " hundreds, " + tens + " tens, and " + units + " units.");
	}
}
