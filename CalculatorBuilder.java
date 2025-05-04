<<<<<<< HEAD
import java.util.Scanner;
public class CalculatorBuilder {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("CALCULATOR");
	

	String Calculator = """

	1. Addition.
	2. SUBTRACTION.
	3. MULTIPLICATION.
	4. DIVISION.

	""";
	System.out.print(Calculator);
	int number = input.nextInt();

	int num = 0;
	int sum = 0;
	int num1 = 0;
	int num2 = 0;



		while (true) {
	switch (number){
	case 1: { System.out.print("Enter a number: "); 
		num = input.nextInt();

		while (num != -1) {
		
		sum = sum + num;

		System.out.print("Enter a number or press -1 to quit: "); 
		num = input.nextInt();
}

		System.out.println("The sum of a number: " + sum);

		System.out.print("Press 0 to return to the mainmenu: ");
		number = input.nextInt();
		System.out.print(Calculator);

		System.out.print("Enter a selection: ");
		number = input.nextInt();

}	
	


	case 2: { System.out.print("Enter a number: "); 
		num1 = input.nextInt();
		
		
		System.out.print("Enter a number: "); 
		num2 = input.nextInt();
		
		int subtract = num1 - num2;

		System.out.println("The subtraction of a number: " + subtract);
		
		System.out.print("Press 0 to return to the mainmenu: ");
		number = input.nextInt();
		System.out.print(Calculator);

		System.out.print("Enter a selection: ");
		number = input.nextInt();

}	

		case 3: { System.out.print("Enter a number: "); 
		num1 = input.nextInt();
		
		
		System.out.print("Enter a number: "); 
		num2 = input.nextInt();
		
		int times = num1 * num2;

		System.out.println("The mutiplication of a number: " + times);
		
		System.out.print("Press 0 to return to the mainmenu: ");
		number = input.nextInt();
		System.out.print(Calculator);

		System.out.print("Enter a selection: ");
		number = input.nextInt();

}	

		case 4: { System.out.print("Enter a number: "); 
		num1 = input.nextInt();
		
		
		System.out.print("Enter a number: "); 
		num2 = input.nextInt();
		
		int divide = num1 / num2;

		System.out.println("The division of a number: " + divide);
		
		System.out.print("Press 0 to return to the mainmenu: ");
		number = input.nextInt();
		System.out.print(Calculator);

		System.out.print("Enter a selection: ");
		number = input.nextInt();

}	


}
}



}
=======
import java.util.Scanner;
public class CalculatorBuilder {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("CALCULATOR");
	

	String Calculator = """

	1. Addition.
	2. SUBTRACTION.
	3. MULTIPLICATION.
	4. DIVISION.

	""";
	System.out.print(Calculator);
	int number = input.nextInt();

	int num = 0;
	int sum = 0;
	int num1 = 0;
	int num2 = 0;



		while (true) {
	switch (number){
	case 1: { System.out.print("Enter a number: "); 
		num = input.nextInt();

		while (num != -1) {
		
		sum = sum + num;

		System.out.print("Enter a number or press -1 to quit: "); 
		num = input.nextInt();
}

		System.out.println("The sum of a number: " + sum);

		System.out.print("Press 0 to return to the mainmenu: ");
		number = input.nextInt();
		System.out.print(Calculator);

		System.out.print("Enter a selection: ");
		number = input.nextInt();

}	
	


	case 2: { System.out.print("Enter a number: "); 
		num1 = input.nextInt();
		
		
		System.out.print("Enter a number: "); 
		num2 = input.nextInt();
		
		int subtract = num1 - num2;

		System.out.println("The subtraction of a number: " + subtract);
		
		System.out.print("Press 0 to return to the mainmenu: ");
		number = input.nextInt();
		System.out.print(Calculator);

		System.out.print("Enter a selection: ");
		number = input.nextInt();

}	

		case 3: { System.out.print("Enter a number: "); 
		num1 = input.nextInt();
		
		
		System.out.print("Enter a number: "); 
		num2 = input.nextInt();
		
		int times = num1 * num2;

		System.out.println("The mutiplication of a number: " + times);
		
		System.out.print("Press 0 to return to the mainmenu: ");
		number = input.nextInt();
		System.out.print(Calculator);

		System.out.print("Enter a selection: ");
		number = input.nextInt();

}	

		case 4: { System.out.print("Enter a number: "); 
		num1 = input.nextInt();
		
		
		System.out.print("Enter a number: "); 
		num2 = input.nextInt();
		
		int divide = num1 / num2;

		System.out.println("The division of a number: " + divide);
		
		System.out.print("Press 0 to return to the mainmenu: ");
		number = input.nextInt();
		System.out.print(Calculator);

		System.out.print("Enter a selection: ");
		number = input.nextInt();

}	


}
}



}
>>>>>>> 837ee5718c9f8a11a271a3153586cf134d4e4504
}