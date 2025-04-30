import java.util.Scanner;
public class SalesCommission{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double num1;
	double num2;
	double num3;
	double num4;

	System.out.print("Enter one salesperson's items sold for week: ");
	int number = input.nextInt();

	int totalEarnings = number / 10;

	if(totalEarnings == 0 && totalEarnings <= 1) {
	num1 = (239.99 * 0.09) + 200;
	System.out.println("Earnings is: " + num1);

}

	else if(totalEarnings == 2) {
	num2 = (129.75 * 0.09) + 200;
	System.out.println("Earnings is: " + num2);

}

	else if(totalEarnings == 3) {
	num3 = (99.95 * 0.09) + 200;
	System.out.println("Earnings is: " + num3);

}

	else if(totalEarnings == 4) {
	num4 = (350.89 * 0.09) + 200;
	System.out.println("Earnings is: " + num4);



}

}

}