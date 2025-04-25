import java.util.Random;
import java.util.Scanner;
public class MysteryFour{
	public static void main(String[] args) {
	Random computerInput = new Random();
	Scanner input = new Scanner(System.in);

	int computer = (int) (Math.random() * 10);

	System.out.print("Guess my number: ");
	int num = input.nextInt();

	int counter = 1;
	int count = 1;
	
	while (num != 0 && num != computer) {
		System.out.print("Try again: ");
		num = input.nextInt();
		counter += 1;
		count += 1;

		if (counter == 3 && num != computer){
		int holder = (int) (Math.random() * 10);
		counter = 0;
		System.out.print("The number has change.");
		 }
		

		 if (computer == num) {
			System.out.println("Congratulatons");
			System.out.printf("The number of input is %d%n", count);
		}	
	
	}
}
}