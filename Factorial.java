import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

 	int factorial = 1;

	System.out.print("Enter a number: ");
	int num = input.nextInt();

	if (num < 0){
	System.out.printf("Wrong number");
}
	else  {
	int counter = 1;

	while(counter <= num) {
	factorial = factorial * counter;
	counter++;
}

	System.out.printf("the factorial %d", factorial * num);

	}


}
}