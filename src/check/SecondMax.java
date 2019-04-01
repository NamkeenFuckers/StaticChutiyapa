package check;

public class SecondMax {
	
	int first_max_number=0;
	int second_max_number=0;
	int temp=0;
	
	
	
	public int getSecondMaxInArray(int a[])
	{
		int length= a.length;
	for (int i = 0; i < length; i++) 
	{
		//Check id current element is greater than
		//first_max_number  so update first_max_number ,second_max_number
	
		if (a[i]>first_max_number) {
		
			//first assign value of first_max_number to second_max_number
			second_max_number=first_max_number;
			//then assign a[i] to first_max_number
			first_max_number=a[i];
// {2,5,23,54,21,32};
//		first_max_number=2, 
			/*first_max_number=2 second_max_number=0
			 * first_max_number=5 second_max_number=2
			 * first_max_number=23 second_max_number=5
			 * first_max_number=54 second_max_number=23
			 * first_max_number=54 second_max_number=23
			 * first_max_number=54 second_max_number=23
			 *  && a[i]!= first_max_number
			 * 
			 * */
			

		}
		//check if current element max to second_max_number and not equals to first_max_number
		//so assign current to second_max_number
		else if(a[i]>second_max_number  )
		{
			
			second_max_number=a[i];
/*			 
 *  first_max_number=54 second_max_number=32
 *  
*/
		}
	}	
		
		return second_max_number;
	}
	
	
	public static void main(String[] args) {
		SecondMax sm= new SecondMax();
	int a[]= {2,5,23,54,21,32};
	
	int second_max_number=sm.getSecondMaxInArray(a);
	System.out.println("Second Maximun in Array "+ second_max_number);
	}

}
