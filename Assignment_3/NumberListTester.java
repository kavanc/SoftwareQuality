import java.util.Scanner;

public class NumberListTester{
	public static void main (String[]args){
		NumberList myNumber = new NumberList();
		/* myNumber.addValue(1);
		myNumber.addValue(100000); */
		
		//input variable created
		Scanner x = new Scanner(System.in);
		for(int i = 0; i < 4; i++){
			 // user is asked to input number
			System.out.println("Enter a number:");
			// number is inputted and checked against current min and max
			int number = x.nextInt();
			myNumber.newValue(number);
		}
		//input closed
		x.close();
		//smallest and largest value outputted
		System.out.println("Smallest value = " + myNumber.getSmallest());
		System.out.println("Largest value = " + myNumber.getLargest());
		;
	}
}
