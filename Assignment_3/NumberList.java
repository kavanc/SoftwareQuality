//import java.lang.Math;

public class NumberList {
	/* private int count;
	private int sum; */

	//smallest value set to max integer 
	//largest value set to min integer
	private int smallest = Integer.MAX_VALUE;
	private int largest = Integer.MIN_VALUE;
	
/* 	public void Data(){
		count = 0;
		sum = 0; 
		smallest = 0;
		largest = 0;
	} */
	
	/* public NumberList(){
		smallest = Math.min(smallest, x);
		largest = Math.max(largest, x);	
	}
	 */

	public void newValue(int x){
		/* sum = sum + x;
		count++; */
		//first value set to largest and smallest
		//following values are checked against that value
		if (x > largest)
			largest = x;
		if (x < smallest)
			smallest = x;
	}
	
	public int getLargest(){
		return largest;
	}
	public int getSmallest(){
		return smallest;
	}

    
}
