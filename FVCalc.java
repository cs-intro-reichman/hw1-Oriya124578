// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code

		int currentvalue = Integer.parseInt(args[0]);

		double ratePercent = Double.parseDouble(args[1]);
		double rate = ratePercent / 100.0;

		int years = Integer.parseInt(args[2]);
		double n = (double) years;

		double futurevalue = currentvalue * Math.pow((1 + rate), n);

		int futurevalueint = (int) futurevalue; 

		System.out.println("After " + years + " years, " + "$" + currentvalue + " saved at " + ratePercent + "% will yield $" + futurevalueint );


		
	}
}