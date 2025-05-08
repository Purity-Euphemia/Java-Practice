public class ArrayManipulatorTwo{
	public static void main(String[] args) {

	char [][] number = new char[3][3];

	char[][] array = {{'X', 'O', 'X'}, {'O', 'O', 'O'}, {'X', 'X', 'O'}};

	for (int count = 0; count < array.length; count++) {
		for (int counter = 0; counter < array.length; counter++) {
		System.out.print(array[count][counter] + " ");
}
		System.out.println();
}	
		


}
}