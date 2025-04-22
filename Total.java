import java.util.Scanner;
public class Total{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);


	System.out.print("Enter a number: ");
	int num = input.nextInt();


	int count = 1;
	int total = 1;

	while(count <= 10) {
		count = count + num;
		total++;

}


	System.out.printf("total %d", num);




}



}