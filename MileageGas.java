<<<<<<< HEAD
import java.util.Scanner;
public class MileageGas{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int total = 0;
	int number = 0;
	int division = 0;

	while(number != -1) {

	System.out.print("THe miles driven: ");
	int number1 = input.nextInt();

	System.out.print("The gallon used: ");
	int number2 = input.nextInt();

	division = number1 / number2;	
	total = total + division;

	System.out.println("The miles per gallon: " + division);
	
	System.out.print("Enter a number to keep on going OR -1 to quit: ");
	number = input.nextInt();
}
	
	System.out.println("The total gallon used: " + total);
	





}



=======
import java.util.Scanner;
public class MileageGas{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int total = 0;
	int number = 0;
	int division = 0;

	while(number != -1) {

	System.out.print("THe miles driven: ");
	int number1 = input.nextInt();

	System.out.print("The gallon used: ");
	int number2 = input.nextInt();

	division = number1 / number2;	
	total = total + division;

	System.out.println("The miles per gallon: " + division);
	
	System.out.print("Enter a number to keep on going OR -1 to quit: ");
	number = input.nextInt();
}
	
	System.out.println("The total gallon used: " + total);
	





}



>>>>>>> 837ee5718c9f8a11a271a3153586cf134d4e4504
}