import java.util.Scanner;
public class MortageCalculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the principal amount: ");
	int amount = input.nextInt();

	System.out.print("Enter the annual interest rate: ");
	double interestRate = input.nextDouble();

	
	System.out.print("Enter the duration in years: ");
	double duration = input.nextDouble();

		double MonthlyinterestRate = interestRate / 1200;

		double numberOfMonth = duration * 12;
 
	double value1 = amount * MonthlyinterestRate * Math.pow(1 + MonthlyinterestRate, numberOfMonth);

	double value2 = Math.pow(1 + MonthlyinterestRate, numberOfMonth) - 1;


	double value3 = value1 / value2;

	
	System.out.printf("Your monthly payment is:%.2f", value3);



}

}