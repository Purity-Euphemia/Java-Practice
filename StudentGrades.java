import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int total = 0;
	int count;

	System.out.print("Enter a grade or press -1 to quit: ");
	int number = input.nextInt();

	while(number != -1) {
	total = total + number;
	count = count + 1;

	System.out.print("Enter a grade or press -1 to quit: ");
	number = input.nextInt();

}	
	if (number != 0) {
	double average = (double) total / count;

	System.out.printf("The total of %d numbers entered is %d%n ", count, total);
	System.out.printf("the average is %.2f%n", average)

}	else {
	System.out.println("No numbers were entered");


}
}
}
