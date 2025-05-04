<<<<<<< HEAD
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
		
	if (number  3 ) {
	sum = number + number;
	total = number / 3; 
	System.out.printf("The number is divisable by 3 %d", number);


	}else{

	System.out.printf("The number is not divisable by 3");






}

}
}
}



=======
import java.util.Scanner;
public class LargestIntegers{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int count = 0;
	int number = 0;
	int division = number / 3;
	int remainder = number % 3;
	
	

	while(count <= 0) {

	System.out.print("Enter an integer: ");
	number = input.nextInt();
		count++;
		
	if (division == 0)  { 
	System.out.print("The number is divisable by 3");

	if (division != 0) {
	System.out.print("The number is not divisable by 3");





}
}

}
}
}



>>>>>>> 837ee5718c9f8a11a271a3153586cf134d4e4504
