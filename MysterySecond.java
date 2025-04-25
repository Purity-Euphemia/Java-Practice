import java.util.Random;
import java.util.Scanner;
public class MysterySecond{
	public static void main(String[] args) {
	Random computerInput = new Random();
	Scanner input = new Scanner(System.in);

	int computer = (int) (Math.random() * 10);

	System.out.print("Guess my number: ");
	int num = input.nextInt();

	int counter = 1;
	
	while (num != 0 && computer != num) {
		System.out.print("Try again: ");
		num = input.nextInt();
		counter += 1;

		 if (computer == num) {
			System.out.printf("Congratulation.%n");
			System.out.printf("The number of guess: %d", counter);
		}
		}																																			
}


}