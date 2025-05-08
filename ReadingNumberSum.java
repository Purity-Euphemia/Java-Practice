import java.util.Scanner;
public class ReadingNumberSum{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int sum = 0;
	int count = 0;
	
	for (count = 0; count < number; count++) {

	System.out.print("Enter a number: ");
	number = input.nextInt();

	if (sum >= number) {

}
	sum = sum + number;

}
	System.out.printf("The sum of the value %d: ", sum);
	


}

}