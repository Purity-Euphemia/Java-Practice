	import java.util.Scanner;
	public class  ArrayKata{
	     public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter number of array element: ");
		int arrayNumber = input.nextInt();
		
		int [] value = new int [arrayNumber];
		for(int count = 0; count < value.length; count++) {
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		value[count] = number;
}		


		System.out.println("The largest number is: " + MaximumIn(value));

		//System.out.println("The smallest number is: " + MinimumIn(value));


		//System.out.println("The Sum number is: " + SumOf(value));

		//System.out.println("The Sum even number is: " + SumOfEvenNumbersIn(value));

		//System.out.println("The Sum odd number is: " + SumOfOddNumbersIn(value));

		//System.out.println("The largest and smallest number are: " + MaxiAndMiniOf(value));

		//System.out.println("The number of odd is: " + NumberOfOddNumbersIn(value));
		
		//System.out.println("The number of even is: " + NumberOfEvenNumbersIn(value));

		//System.out.println("The even numbers are: " + NoOfEvenNumbersIn(value));





	}
		

		public static int MaximumIn(int [] number){
			int count = 0;
			int largestElement = 0;
		for(count = 0; count < number.length; count++){
			if(number[count] > largestElement){
				largestElement = number[count];
			}	
		} 	return largestElement;
		
	}



		public static int MinimumIn(int[] number){
			int count = 0;
			int smallestElement = number[count];
		for(count = 0; count < number.length; count++){
			if(number[count] < smallestElement){
				smallestElement = number[count];

			}	
		} 	return smallestElement;
		
	}


		public static int SumOf(int [] number){
			int count = 0;
			int sum = 0;
		for(count = 0; count < number.length; count++){
				sum = sum + number[count];
				
		} 	
		
		return sum;
	}


		public static int SumOfEvenNumbersIn(int [] number){
			int sum = 0;
		for(int count = 0; count < number.length; count++){
			if (number[count] % 2 == 0){	
				sum = sum + number[count];
			}
				
		} 	
		
		return sum;
	}


		public static int SumOfOddNumbersIn(int [] number){
			int sum = 0;
		for(int count = 0; count < number.length; count++){
			if (number[count] % 2 == 1){	
				sum = sum + number[count];
			}	
		} 	
		
		return sum;
	}


		public static String MaxiAndMiniOf(int [] number){
			
			int largestElement = number[0];
			int indexOfMax = 0;
		for(int count = 0; count < number.length; count++){
			if(number[count] > largestElement){
				largestElement = number[count];
				indexOfMax = count;
			}	
		} 	
			return largestElement + " " + indexOfMax;
		
	}


		public static int NumberOfOddNumbersIn(int [] number){
			int oddCount = 0;
		for(int count = 0; count < number.length; count++){
			if (number[count] % 2 != 0){	
			 oddCount = oddCount + 1;
			}	
		} 	
		
		return oddCount;
	}

		public static int NumberOfEvenNumbersIn(int [] number){
			int evenCount = 0;
		for(int count = 0; count < number.length; count++){
			if (number[count] % 2 == 0){	
			 evenCount++;
			}	
		} 	
		
		return evenCount;
	}	


		public static int NoOfEvenNumbersIn(int [] number){
			int count = 0;
			int evenNumber = 0;
		for(count = 0; count < number.length; count++){
			if (number[count] % 2 == 0){	
			  	evenNumber++;
			}	
		} 	
		
		return evenNumber++;
	}








}



