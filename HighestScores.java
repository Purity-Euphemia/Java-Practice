import java.util.Scanner;
public class HighestScores{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	

	String name = " ";
	int count = 1;
	int score = 0;
	int highest = 0;

	System.out.print("Enter a number of student: ");
	int number = input.nextInt();
	

	while(count <= number) {
		
	System.out.print("Enter student name: ");
	name = input.next();

	System.out.print("Enter student score: ");
	score = input.nextInt();

	if (score > highest) {
		highest = score;
		name = name;

 
}
	count++;

}
	

	System.out.println(name + " is the highest with score: " + highest);




}



}



