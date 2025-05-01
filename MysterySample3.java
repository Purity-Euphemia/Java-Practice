public class MysterySample3 {
	public static void main(String[] args) {


	int row = 1;

	while (row <= 5) {
	int column = 1;


	while (column <= 5) {

	System.out.print(row % 2 == 1 ? "X" : "O");
	++column;

}

	--row;
	System.out.println();


}

}

}