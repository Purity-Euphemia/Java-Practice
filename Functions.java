import java.util.Scanner;
public class Functions {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number1 = input.nextInt();

	System.out.print("Enter a number: ");
	int number2 = input.nextInt();


	Kata kata = new Kata();

	//System.out.println(Kata.evenAndOddChecker(number));
	//System.out.println(Kata.SquareOfInteger(number));
	//System.out.println(Kata.PrimeNumber(number));
	//System.out.println(Kata.SubtractInteger(number1,number2));
	System.out.println(Kata.DivideInteger(number1,number2));
}


}