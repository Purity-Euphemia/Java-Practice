import java.util.Scanner;
public class LargestIntegers{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	int count = 0;
	int total = 0;

	while(count <= 0) {

	System.out.print("Enter an integer: ");
	int number = input.nextInt();
		count++;
		
	if (number == 3) {
	sum = number + number;
	total = number / 3; 
	System.out.printf("The number is divisable by 3 %d", number);


	}else{

	System.out.printf("The number is not divisable by 3");






}

}
}
}



