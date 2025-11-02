// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(System.console().readLine("Enter the upper limit for the random numbers: "));
		int first = (int)(Math.random() * (lim - 0 + 1));
		int second = (int)(Math.random() * (lim - 0 + 1));
		int third = (int)(Math.random() * (lim - 0 + 1));
		System.out.println("The three random numbers are: " + first + ", " + second + ", " + third);
		int temp;
		if (first < second) {
			temp = first;
			first = second;
			second = temp;
		}
		if (first < third) {
			temp = first;
			first = third;
			third = temp;
		}
		if (second < third) {
			temp = second;
			second = third;
			third = temp;
		}
		System.out.println("The numbers in ascending order are: " + first + ", " + second + ", " + third);
	}
}
