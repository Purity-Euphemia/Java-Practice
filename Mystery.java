import java.util.Random;
import java.util.Scanner;
public class Mystery{
	public static void main(String[] args) {
	Random computerInput = new Random();
	Scanner input = new Scanner(System.in);

	int computer = (int) (Math.random() * 10);

	System.out.print("Guess my number: ");
	int num = input.nextInt();

	int counter = 0;
	
	while (computer != num && counter != 2) {
		System.out.print("Try again: ");
		num = input.nextInt();
		counter += 1;

		 if (computer == num) {
			System.out.print("correct");
		}	
	
		 else if(num > computer) {
			System.out.println("Too high");
		}	
	
		 else if (num < computer) {
			System.out.println("Too low");
		}
	}
}
}