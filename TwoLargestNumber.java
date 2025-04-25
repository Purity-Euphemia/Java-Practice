import java.util.Scanner;
public class TwoLargestNumber {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		


		int num = 0;
		int count = 1;
		int largest = 0;
		int secondLargest = 0;

		while (count <= 10) {
		
		System.out.print("Enter a number from 1 to 10: ");
		num = input.nextInt();
		count++;	
	
		if(num > largest) {
		secondLargest = largest;
		largest = num;

}
		else if (num != largest) {
		secondLargest = num;
}
}
	System.out.printf("The largest: %d%n", largest);

	System.out.printf("The SecondLargest: %d", secondLargest);	
	


							










}



}