import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	double earning = 0; 
	double total = 0;
	int number1 = 0;
	int number2 = 0; 



	for (int count = 0; count < 3; count++) {

	System.out.print("Enter your name: ");
	String name = input.next();

	System.out.print("Enter your earnings in a year: ");
	double number = input.nextDouble();


	if (number1 < 30000) {
	  earning = number * 0.15;
	System.out.println("The earning tax in a year: " + earning);
}
	
	if (number2 > 30000) {
	  earning = number * 0.2;
	System.out.println("The earning tax in a year: " + earning); 

}	
	total = total + number;

}
	System.out.print("The citizen's total tax: " + total);


}
}