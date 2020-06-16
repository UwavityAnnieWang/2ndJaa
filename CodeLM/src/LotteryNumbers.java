
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class LotteryNumbers {
	
	
	public static int Numbers(int hint) {
		ArrayList<Integer>arraylist = new ArrayList<>();
		String ret = "";
		String []array = Integer.toString(hint).split("");
		for(int i =0; i<array.length; i++) {
			arraylist.add(Integer.parseInt(array[i]));
		}
		
		Collections.sort(arraylist, Collections.reverseOrder());
		for(int i =0; i<arraylist.size(); i++) {
			ret+=arraylist.get(i);
		}
		//System.out.println(arraylist);
		return Integer.parseInt(ret);
		/**for(int i =0; i<array.length-1; i++) {
			if(Integer.parseInt(array[i])>Integer.parseInt(array[i+1])) {
				String temp = array[i+1];
				array[i+1]=array[i];
				array[i]=temp;
			}
			ret+=array[i];
		}
		return Integer.parseInt(ret);**/
		
		/**String re ="";
		ArrayList<Integer>arraylist = new ArrayList<>();
		char[]array = Integer.toString(hint).toCharArray();
		for(int i =0; i<array.length; i++) {
			
			//arraylist.add(Integer.parseInt());
		}
		Collections.sort(arraylist);
		for(int i =0; i<arraylist.size(); i++) {
			re+=arraylist.get(i);
		}
		//looks like im not using bubble sort 
		return Integer.parseInt(re);
		//use bubble sort 
		/**char []array = Integer.toString(hint).toCharArray();
		System.out.println(array.length);
		String wow = new String();
        int current=0;
		
		/**while(current<array.length) {
			
			for(int i=current+1; i<array.length-1; i++) {
				
				
				if(array[i]<=array[current]) {
				
					swap(array, i, current);
			}
			current++;
		
		/**for(int i=0; i<array.length-1; i++) {
			
			int dink =Integer.compare(Integer.parseInt(Character.toString(array[i])), Integer.parseInt(Character.toString(array[i++])));
			if(dink<0) {
				System.out.println("true");
				char temp =array[i];
				array[i]=array[i++];
				array[i++]=temp;
			}
			System.out.println(array[1]);
			
		}
			
	/**String comrade = Integer.toString(hint);
	String getter=" ";
	char[]array = comrade.toCharArray();
	//we're using bubble sort
	int current =0;
	while(current<array.length) {
		for(int i=current+1; i<array.length; i++) {
			int compare =Integer.compare(Integer.parseInt(Character.toString(array[i])), Integer.parseInt(Character.toString(array[i++])));
			if(compare<0) {
				char temp =array[i];
				array[i]=array[i++];
				array[i++]=temp;
			}
			current++;
			
		}
	}
	//System.out.println(array[0]);
	/**for(int i=1; i<array.length; i++) {
		System.out.println("wow");
		int compare =Integer.compare(Integer.parseInt(Character.toString(array[i])), Integer.parseInt(Character.toString(array[i++])));
		if(compare<0) {
			char temp =array[i];
			array[i]=array[i++];
			array[i++]=temp;
		}
		getter += Character.toString(array[i]);
		
	}
	System.out.println(getter);
	
	
	
	//System.out.println(Integer.parseInt(comrade));
	/**for(int i=0; i<array.length; i++) {
		System.out.println("wat");
		//System.out.println(array[i]);
		Integer.compare(Integer.parseInt(array[i]), Integer.parseInt(array[i++]));
		if(Integer.compare(Integer.parseInt(array[i]), Integer.parseInt(array[i++]))<0) {
			String temp = array[i];
			array[i]=array[i++];
			array[i]=temp;
		}**/
		
	//}
		
	
		 //}
	/**wow=new String(array);
	//System.out.println(wow);
		return Integer.parseInt(wow);**/
	}

	static Scanner s = new Scanner(System.in);

	// Write a program that would compute the next highest integer using the same numbers that are given in a hint. 
	// The number given may already be the largest possible number composed of those digits, in which case the number 
	// should be returned without modification. The hint will be less than 263. Remember that your solution must run 
	// in less than 10 seconds.
	//
	// sample data to copy into input stream
	// 732
	//
	// 981132567
	//
	// 987566554321
	//
	// 9988761
	//
	// 862582347377
	//
	// When you are finished, copy and paste the the entire contents of this file into the
	// dashboard to test your algorithm.

	public static void main(String[] args) {
		System.out.println("Input ");
		int hint = s.nextInt();					 // an integer hint
		System.out.println(Numbers(hint));								
		// code to solve the problem.  You can write and call other methods as well.

		System.out.println();                    // print your answer and just your answer.
	}

}
