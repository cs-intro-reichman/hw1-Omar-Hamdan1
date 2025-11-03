// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    // Replace this comment with the rest of your code
	    String name1 = args[0];
	    String name2 = args[1];
	    String name3 = args[2];
		int bill = Integer.parseInt(args[3]);
		int share = bill / 3;
		if (bill % 3 != 0){
			share += 1;
		}
		System.out.println("Dear " + name1 + ", " + name2 + " and " + name3 + ": pay " + (double)(share) + " Shekels each.");
	}
}
