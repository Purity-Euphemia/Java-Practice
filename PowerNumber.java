import java.util.Scanner;
public class PowerNumber{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num1 = input.nextInt();


	System.out.print("Enter a power: ");
	int num2 = input.nextInt();


	int value = 1;
	int num = 1;
	
	while(num <= num2) {
		value = value * num1;
		num++;

}

	System.out.print("digit raised to num = " + value);





}

}