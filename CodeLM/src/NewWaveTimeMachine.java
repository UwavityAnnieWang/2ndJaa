import java.util.Scanner;

public class NewWaveTimeMachine {

	static Scanner s = new Scanner(System.in);
	public static double tell(int start, int end, int jump1, int jump2, int jump3, int jump4, int jump5) {
		int year = start;
		int holder = year;
		double count = 0;
		
		//one iteration 
		 int[]array ={jump1, jump2, jump3, jump4, jump5};
		 while(!(holder>=end)) {
			 for(int i =0; i<array.length; i++) {
				 year+=array[i];
				 System.out.println(year);
				 count+=0.2;
				 if(year==end) {
					 i=array.length;
				 }
				 if(year>end) {
					 i=array.length;
				 }
			 }
			 holder=year;
		 }
		/**do {
			for(int i =0; i<array.length; i++) {
				start+=array[i];
				count+=0.2;
			}
			
		}while(year!=end||year<end);
		/**while(year!=end||year<end) {
			for(int i =0; i<array.length; i++) {
				year+=i;
				count+=0.2;
			}**/
			
		//}
		return count;
	}


	// Write a program that accepts the starting and finishing years for Noah's trip along with 
	// the lengths of each of the five time jumps and returns how many iterations Noah would need to take.
	//
	// sample data to copy into input stream
	// 2016
	// 2110
	// 1
	// 6
	// 3
	// 4
	// 2
	//
	// 2019
	// 2231
	// 4
	// 3
	// 2
	// 4
	// 1
	//
	//
	// When you are finished, copy and paste the the entire contents of this file into the
	// dashboard to test your algorithm.

	public static void main(String[] args) {
		/**int startingYear = s.nextInt();                  
		int endingYear = s.nextInt();
		int jump1 = s.nextInt();
		int jump2 = s.nextInt();
		int jump3 = s.nextInt();
		int jump4 = s.nextInt();
		int jump5 = s.nextInt();**/
		System.out.println(tell(2016, 2110, 1,6,3,4,2));
		
		// code to solve the problem.  You can write and call other methods as well.

		System.out.println();                    // print your answer and just your answer.
	}

}
