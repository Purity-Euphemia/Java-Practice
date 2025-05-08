public class unique{
	public static void main(String[] args){
		int [] number = {1, 2, 3, 2};

	System.out.println("The unique number is: " + NumberOfUnique(number));


}

	public static int NumberOfUnique(int [] number){

		int count = 0;
		int uniqueNumber = 0;
	for(count = 0; count < number.length; count++){
	if(number[count] > uniqueNumber){
		uniqueNumber = number[count];

}
	return uniqueNumber;

}


}



}