import java.util.Scanner;
public class PosistiveInteger{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
	int count = 0;
	int positive = 0;
	int negative = 0;
	double total = 0;
	double average = 0;

	System.out.print("The a number: ");
	int number = input.nextInt();

	while (number != 0) {

	if (number > 0) {
	positive++;
}
	if (number < 0) {
	negative++;

}
	total = total + number;

	System.out.print("The a number: ");
	number = input.nextInt();
	count++;
	
}	
	average = total / count;


	System.out.println("The positive number: " + positive);

	System.out.println("The negative number:" + negative);

	System.out.println("The total number: " + total);

	System.out.println("The average numbers: " + average);





}
}