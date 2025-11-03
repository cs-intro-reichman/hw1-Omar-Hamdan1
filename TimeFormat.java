// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		// Expect a single argument in the form "hh:mm" (24-hour clock)
		if (args == null || args.length == 0) {
			System.err.println("Usage: java TimeFormat hh:mm (24-hour)");
			return;
		}

		String s = args[0];
		if (s.length() != 5 || s.charAt(2) != ':') {
			System.err.println("Input must be in hh:mm format (example: 12:50)");
			return;
		}

		int hours;
		int minutes;
		try {
			hours = Integer.parseInt("" + s.charAt(0) + s.charAt(1));
			minutes = Integer.parseInt("" + s.charAt(3) + s.charAt(4));
		} catch (NumberFormatException e) {
			System.err.println("Invalid numeric time");
			return;
		}

		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
			System.err.println("Time out of range");
			return;
		}

		String period;
		int displayHour;
		if (hours == 0) {
			displayHour = 0;
			period = "AM";
		} else if (hours < 12) {
			displayHour = hours;
			period = "AM";
		} else if (hours == 12) {
			displayHour = 12;
			period = "PM";
		} else {
			displayHour = hours - 12;
			period = "PM";
		}

		// Ensure minutes are two digits
		String minStr = String.format("%02d", minutes);
		System.out.println(displayHour + ":" + minStr + " " + period);
	}
}