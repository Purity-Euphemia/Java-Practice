	public class  ArrayKata{
	     public static void main(String[] args){
			int [] number = {5, 9, 10, 12, 6};

		System.out.println("The largest number is: " + MaximumIn(number));




	}
		

		public static int MaximumIn(int [] number){
			int count = 0;
			int largestElement = 0;
		for(count = 0; count< number.length; count++){
			if(number[count] > largestElement){
				largestElement = number[count];
			}	
		} 	return largestElement;
		
	}



}



