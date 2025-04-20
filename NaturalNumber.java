import java.util.Scanner;
public class NaturalNumber{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int counter = 0;
	int number;
	int sum = 1;

	System.out.print("Enter number 1 to 10: ");
	number = input.nextInt();

	while(sum <= number) {
	counter = counter + sum;
	sum++;

	}
	
	System.out.printf("The sum %d", counter);


}

}