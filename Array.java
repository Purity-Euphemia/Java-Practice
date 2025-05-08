public class Array {
	public static void main(String[] args) {

	int[] array = new int[5];
	int[] count = {22, 51, 38, 23, 48};
	int sum = 0;
	
	for (int counter = 0; counter < array.length; counter++) {
		System.out.println(count[counter]);
}		


	for (int counter = 0; counter < array.length; counter++) {
		System.out.print(count[counter] + " ");
}	

	for (int counter = 0; counter < array.length; counter++) {
		sum = sum + count[counter];
		
}	

	System.out.printf("%n Sum: %d", sum );

}
}