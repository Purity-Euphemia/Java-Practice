import java.util.Scanner;
public class FunctionCurrentDate{
	public static void main(String[] args) {
	Scanner input = new Scanner;
	
	System.out.print("Enter a number: ");
	int num1 = input.nextInt();


	System.out.print("Enter a number: ");
	int num2 = input.nextInt();

	CurrentDate currentDate = new CurrentDate();
	

	System.out.print(CurrentDate.currentTimeMillis);


}




}