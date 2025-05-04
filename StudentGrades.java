<<<<<<< HEAD
import java.util.Scanner;
public class MileageGas{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int division = 0;
	int count;

	while( count != 0) {

	System.out.print("THe mles driven: ");
	int number1 = input.nextInt();

	System.out.print("The gallon used: ");
	int number2 = input.nextInt();

	division = number1 / number2;

	System.out.printf("The miles per gallon %.2f", division);
	
	System.out.print("Enter a number to keep on going OR -1 to quit");
	int count = input.nextInt();
	count++;
	division++;




}


}



=======
import java.util.Scanner;
public class MileageGas{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int division = 0;
	int count;

	while( count != 0) {

	System.out.print("THe mles driven: ");
	int number1 = input.nextInt();

	System.out.print("The gallon used: ");
	int number2 = input.nextInt();

	division = number1 / number2;

	System.out.printf("The miles per gallon %.2f", division);
	
	System.out.print("Enter a number to keep on going OR -1 to quit");
	int count = input.nextInt();
	count++;
	division++;




}


}



>>>>>>> 837ee5718c9f8a11a271a3153586cf134d4e4504
}