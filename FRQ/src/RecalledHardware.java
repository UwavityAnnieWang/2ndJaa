import java.lang.reflect.Array;
import java.util.Scanner;

public class RecalledHardware {

	static Scanner s = new Scanner(System.in);
	/**public static boolean palindrome(String one) {
		String test = new String();
		String comp = new String();
		char[]array = one.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			int something = (int)array[i];
			String temp = Integer.toString(something);
			test+=something;
			
		}
		for(int i =0; i<array.length; i++) {
			int something = (int)array[i];
			String temp = Integer.toString(something);
			comp+=something;
		}
		System.out.println(test);
		System.out.println(comp);
		if(test.equals(comp)) {
			System.out.println("her");
			return true;
		}else {
		/**StringBuilder well = new StringBuilder();
		String temp = one.replaceAll("\\s+", "").toLowerCase();
		
		//return true;
		//String temp = one.toLowerCase();
		int backward = temp.length()-1;
		int towards =0;
		
		while(backward>0) {
			char f = temp.charAt(towards++);
			char d = temp.charAt(backward--);
			if((int)(f)!=(int)(d)) {
				System.out.println("wait");
				return false;
			}
			backward--;
			
		}
		return false;}
	}**/
	
	public static boolean valid (String read) {
		System.out.println(read.substring(2,2));
		String temp = read.substring(8,11);
		String comp = new String();
		String other = new String();
		
		//String[]array = read.substring(8,11).split("");
		
		for(int i =0; i<temp.length(); i++) {
			if((int)temp.charAt(i)!=temp.charAt(i)) {
				int wow = (int)temp.charAt(i);
				char ugh = (char) wow;
				temp.replace(temp.charAt(i), ugh);
			}
			comp+=temp.charAt(i);
		}
		for(int i=temp.length()-1; i>=0; i--) {
			if((int)temp.charAt(i)!=temp.charAt(i)) {
				int wow = (int)temp.charAt(i);
				char ugh = (char) wow;
				temp.replace(temp.charAt(i), ugh);
			}
			other+=temp.charAt(i);
		}
		System.out.println(temp);
		
		if(comp.equals(temp)) {
			return true;
		}else {
		
		/**if(palindrome(temp)==true) {
			System.out.println("help");
			return true;
		}else {**/
		if(read.startsWith("NJ")&&read.substring(4,5).equals("11")||read.substring(4,5).equals("12")
				||read.substring(4,5).equals("01")||read.substring(4,5).equals("02")) {
			return true;
			
		}
		if(read.startsWith("AK")||read.startsWith("NY")&&read.substring(4,7).equals("0816")) {
			if(Integer.getInteger(read.substring(8,11))%9==0&&Integer.getInteger(read.substring(8,11))%27!=0) {
				return false;
			}
			return true;
		}
		
		
		if(read.contains("PA6")) {
			
			
			return true;
		}}
		
		
		
		//String one = array[8]+array[9]+array[10]+array[11];
		
		
		
		return true;
		
	}
    
	public static void main(String[] args) {
		//String serialNumber = s.next();      // An 11 character serial number.
		
		// code to solve the problem.  You can write and call other methods as well.
		
		System.out.println(valid("PA601162o12"));                // print your answer and just your answer.
	}

}
