// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    // Replace this comment with the rest of your code
		System.out.println("Splitting a restaurant bill evenly among three diners.");
	    String name1 = System.console().readLine("Enter the first diner's name: ");
	    String name2 = System.console().readLine("Enter the second diner's name: ");
	    String name3 = System.console().readLine("Enter the third diner's name: ");
		int bill = Integer.parseInt(System.console().readLine("Enter the total bill amount (in dollars): "));
		System.out.println("Dear " + name1 + ", " + name2 + " and " + name3 + ", each pays $" + (bill / 3) + ".");
	}
}
