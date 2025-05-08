import java.util.Scanner;
public class NumberLargest{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		int largest = 0;
		int secondLargest = 0;
	
	for (int count = 1; count <= 10; count++) {
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
		
	
	if (number > largest) {
	secondLargest = largest;
	largest = number;
}

	else if (number > largest && number != largest) {
	secondLargest = number;

}
}
	
	System.out.println("The largest number: " + largest);

	System.out.print("The secondLargest number: " + secondLargest);

	



}
}

