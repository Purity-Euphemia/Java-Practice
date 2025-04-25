import java.util.Scanner;
public class NaturalNumber{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter number 1 to 10: ");
	int num = input.nextInt();

	int number = 10;
	int sum = 0;

	sum = num + num;
	System.out.printf("The sum %d", sum);


}

}