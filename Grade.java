<<<<<<< HEAD
import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Student grade");
 

	int Grades = 0;
	int validInput = 0;
	int IncorrectInput = 0;
	int A = 0;
	int B = 0;	
	int C = 0;
	int D = 0;
	int F = 0;
	


		while (validInput != 10) {

	System.out.print("Enter valid score from 1 to 100: ");
	int number = input.nextInt();

		

	if (number <= 0 || number > 100) {
	System.out.println("Incorrect input");
	IncorrectInput++;
}

	else if(number >= 0 && number <= 100) {
		
		 Grades = number / 10;
		
	switch(Grades) {

	case 0, 1, 2, 3, 4: System.out.println("F"); F++; break;

	case 5: System.out.println("D"); D++; break;

	case 6: System.out.println("C"); C++; break;
	
	case 7: System.out.println("B"); B++; break;

	case 8, 9, 10: System.out.println("A"); A++; break;
	
	default: System.out.println("Incorrect input");
		
}
	validInput++;
	
}

}

	System.out.printf("The number of Grade A %d%n", A);
	System.out.printf("The number of Grade B %d%n", B);
	System.out.printf("The number of Grade C %d%n", C);
	System.out.printf("The number of Grade D %d%n", D);
	System.out.printf("The number of Grade F %d%n", F);
	System.out.printf("The number of Incorrect input %d%n", IncorrectInput);







}		

=======
import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Student grade");
 

	int Grades = 0;
	int validInput = 0;
	int IncorrectInput = 0;
	int A = 0;
	int B = 0;	
	int C = 0;
	int D = 0;
	int F = 0;
	


		while (validInput != 10) {

	System.out.print("Enter valid score from 1 to 100: ");
	int number = input.nextInt();

		

	if (number <= 0 || number > 100) {
	System.out.println("Incorrect input");
	IncorrectInput++;
}

	else if(number >= 0 && number <= 100) {
		
		 Grades = number / 10;
		
	switch(Grades) {

	case 0, 1, 2, 3, 4: System.out.println("F"); F++; break;

	case 5: System.out.println("D"); D++; break;

	case 6: System.out.println("C"); C++; break;
	
	case 7: System.out.println("B"); B++; break;

	case 8, 9, 10: System.out.println("A"); A++; break;
	
	default: System.out.println("Incorrect input");
		
}
	validInput++;
	
}

}

	System.out.printf("The number of Grade A %d%n", A);
	System.out.printf("The number of Grade B %d%n", B);
	System.out.printf("The number of Grade C %d%n", C);
	System.out.printf("The number of Grade D %d%n", D);
	System.out.printf("The number of Grade F %d%n", F);
	System.out.printf("The number of Incorrect input %d%n", IncorrectInput);







}		

>>>>>>> 837ee5718c9f8a11a271a3153586cf134d4e4504
}