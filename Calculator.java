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
		number = input.nextInt();
		
		while (number != 0) {
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		

		sum = sum + number;
		
		System.out.println("The sum of the number: " + sum);
		
		System.out.println("Press 0 quit or any number to countine: ");
		number1 = input.nextInt();
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
		
		subtract = number6 - number7;
		System.out.println("The subtract of the number: " + subtract);

		while(quit != 0) {
		System.out.println("Press 0 quit or any number to countine: ");
		quit = input.nextInt();
		quit++;
}
}break;


		case 3: System.out.println("MULTIPLICATION"); {
		
		int multiply = 0;
		int quit = 0;
		

		System.out.println("Enter a number: ");
		int number8 = input.nextInt();

		System.out.println("Enter a number: ");
		int number9 = input.nextInt();

		while(quit != 0) {
		
		multiply = number8 * number9;
}		
		System.out.println("The multiplication of the number: " + multiply);
		System.out.println("Press 0 quit or any number to countine: ");
		quit = input.nextInt();
		quit++;

}break;


		case 4: System.out.println("DIVISION"); {
		
		int divide = 0;
		int quit = 0;
		

		System.out.println("Enter a number: ");
		int number10 = input.nextInt();

		System.out.println("Enter a number: ");
		int number11 = input.nextInt();

		if (number11 == 0) {
		System.out.println("0");

}		else {
		while(quit != 0) {
		
		divide = number10 / number11;
}		
		System.out.println("The division of the number: " + divide);
		System.out.println("Press 0 quit or any number to countine: ");
		quit = input.nextInt();
		quit++;
}
}break;

}
}
}
