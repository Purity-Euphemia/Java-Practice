import java.util.Scanner;
public class PriceperLiter{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("Enter price per liter: ");
	double budget = input.nextDouble();

	budget = budget / 855;

	System.out.println("How many liters of fuels the costumer can purchase: " + budget);





}

}

