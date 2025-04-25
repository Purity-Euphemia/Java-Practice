import java.util.Scanner;
public class Factors{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in); 

	System.out.print("Enter a positive number: ");
	int num = input.nextInt();
	

	System.out.println("Factors of " +num+ " are: ");


	for(int number = 1; number <= num; number++) {
	if(num % number == 0) {
	System.out.print(number + " ");

}

}


}


}