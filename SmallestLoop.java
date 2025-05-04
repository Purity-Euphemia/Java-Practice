<<<<<<< HEAD
import java.util.Scanner;
public class SmallestLoop{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int smallest = 0;


	System.out.print("Enter a number: ");
	int num = input.nextInt();

	while(num != -1) {
	

	if(num > largest) {
	largest = num;

}
	if(num < smallest) {
	smallest = num;
}

	if(num < -1) {
	System.out.print("wrong number");
}


	System.out.print("Enter a number: ");
	num = input.nextInt();

}

	System.out.printf("The largest number %d%n", largest);

	System.out.printf("The smallest number %d%n", smallest);





	







}
=======
import java.util.Scanner;
public class SmallestLoop{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int smallest = 0;


	System.out.print("Enter a number: ");
	int num = input.nextInt();

	while(num != -1) {
	System.out.print("wrong number");
	

	if(num > largest) {
	largest = num;

}
	if(num < smallest) {
	smallest = num;
}
S



	System.out.print("Enter a number: ");
	num = input.nextInt();

}

	System.out.printf("The largest number %d%n", largest);

	System.out.printf("The smallest number %d%n", smallest);





	







}
>>>>>>> 837ee5718c9f8a11a271a3153586cf134d4e4504
}