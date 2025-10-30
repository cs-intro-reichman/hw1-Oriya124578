// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

		int number = Integer.parseInt(args[0]);

		int hundreds = number / 100;

		int remainder100 = number % 100;

		int tens = remainder100 / 10;

		int remainder10 = remainder100 % 10;

		int units = remainder10;

		System.out.println(hundreds +" hundreds, " + tens + " tens, and " + units + " ones.");



		
	    // Replace this comment with your code
	}
}
