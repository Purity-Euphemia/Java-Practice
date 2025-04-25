import java.util.Scanner;
public class Numbers{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter any number: ");
	int num = input.nextInt();
	
	int factorial = 1;

	if(num < 0) {
	System.out.print("invalid number");
}
	
	else{
	

	for(int count = 1; count <= num; count++) {
	factorial = factorial * count;
	
}


	System.out.printf("The value of number:%d", factorial);


}







}

}