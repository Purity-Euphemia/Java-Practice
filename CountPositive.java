<<<<<<< HEAD
import java.util.Scanner;
public class CountPositive{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int count = 0;
	int positiveNumbers = 0;
	int negativeNumbers = 0;
	double total = 0;
	double average = 0;

	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	while(number != 0) {
	
	total = total + number;
	
	if(number > 0) {
	positiveNumbers++;
	
}
	if(number < 0) {
	negativeNumbers++;
}	

	System.out.print("Enter a number: ");
	number = input.nextInt();
	count++;
	
	
}	
	average = total / count;
	
	System.out.println("The average of numbers: " + average);
	
	System.out.println("The positive numbers: " + positiveNumbers);
	
	System.out.println("The negative numbers: " + negativeNumbers);
	
	System.out.println("The total numbers:  " + total);
}
=======
import java.util.Scanner;
public class CountPositive{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int count = 0;
	int positiveNumbers = 0;
	int negativeNumbers = 0;
	double total = 0;
	double average = 0;

	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	while(number != 0) {
	
	total = total + number;
	
	if(number > 0) {
	positiveNumbers++;
	
}
	if(number < 0) {
	negativeNumbers++;
}	

	System.out.print("Enter a number: ");
	number = input.nextInt();
	count++;
	
	
}	
	average = total / count;
	
	System.out.println("The average of numbers: " + average);
	
	System.out.println("The positive numbers: " + positiveNumbers);
	
	System.out.println("The negative numbers: " + negativeNumbers);
	
	System.out.println("The total numbers:  " + total);
}
>>>>>>> 837ee5718c9f8a11a271a3153586cf134d4e4504
}