import java.util.Scanner;
public class ReadingNumber{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int count = 0;
	int sum = 0;


	while (sum > number ) {

	System.out.print("Enter a number: ");
	number = input.nextInt();
	
	sum = sum + number;

	System.out.println("The sum of the number: " + sum);
	++sum;




}


}

}