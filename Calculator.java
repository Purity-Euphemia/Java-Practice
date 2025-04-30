import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.println("CALCULATOR");

	String Calculator = """

	1. Addition.
	2. Substraction.
	3. Multiplication.
	4. Division.
	
	""";
	System.out.println(Calculator);
	int number1 = input.nextInt();

	switch (number1){
	case 1: System.out.println("ADITTION"); {
		
		int sum = 0;
		int quit = 0;
		int number = 0;
		
		
		System.out.println("Enter a number: ");
		number2 = input.nextInt();
		
		while (number != 0) {
		
		sum = number2 + number3;
		

		System.out.println("Enter a number: ");
		number3 = input.nextInt();
		
		
		System.out.println("The sum of the number: " + sum);
		
		System.out.println("Press 0 quit or any number to countine: ");
		number = input.nextInt();
		number++;
}		
}break;
		
		case 2: System.out.println("SUBSTRACTION"); {
		
		int subtract = 0;
		int quit = 0;
		

		System.out.println("Enter a number: ");
		int number6 = input.nextInt();

		System.out.println("Enter a number: ");
		int number7 = input.nextInt();

		while(quit != 0) {
		
		subtract = number6 - number7;
}		
		System.out.println("The subtract of the number: " + subtract);
		System.out.println("Press 0 quit or any number to countine: ");
		quit = input.nextInt();
		quit++;

}break;











































}

}
}