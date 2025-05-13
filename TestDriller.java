import java.util.Scanner;
public class TestDriller{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num = input.nextInt();

	if (num >= 1 && num < 4){
	int price = num * 2000;
	System.out.printf("The price you should pay:%d ", price);
}

	if (num >= 5 && num < 9){
	int price = num * 1800;
	System.out.printf("The price you should pay:%d ", price);
}

	if (num >= 10 && num < 29){
	int price = num * 1600;
	System.out.printf("The price you should pay:%d ", price);


}
	if (num >= 30 && num < 49){
	int price = num * 1500;
	System.out.printf("The price you should pay:%d ", price);

}
	if (num >= 50 && num < 99){
	int price = num * 1300;
	System.out.printf("The price you should pay:%d ", price);

}

	if (num >= 100 && num < 199){
	int price = num * 1200;
	System.out.printf("The price you should pay:%d ", price);

}
	if (num >= 200 && num < 499){
	int price = num * 1000;
	System.out.printf("The price you should pay:%d ", price);


}
	if (num >= 5000){
	int price = num * 1000;
	System.out.printf("The price you should pay:%d ", price);


}






}

}