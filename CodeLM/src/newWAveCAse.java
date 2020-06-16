import java.util.Scanner;

public class newWAveCAse {

	static Scanner s = new Scanner(System.in);
	
	public static String scramble(String normal) {
		String holder=new String();
		String[]array = normal.split("");
		int teller =0;
		String temp = new String();
		while(!(teller>=array.length)) {
			if(teller!=0) {
			if(normal.contains("_")) {
			if(array[teller].contains("_")&&!(teller+3>=array.length)) {
				temp = array[teller+1].toUpperCase();
				array[teller+1]=temp;
				temp=array[teller+2].toUpperCase();
				array[teller+2]=temp;
				teller+=3;
			}
			}else {
				if(array[teller].toUpperCase()==array[teller]&&!(teller+2>=array.length)) {
					temp = array[teller+1].toUpperCase();
					array[teller+1]=temp;
					teller+=2;
				}
				
			}}
			temp=array[teller].toLowerCase();
			array[teller]=temp;
			teller++;
		}
		
		/**for(int i =0; i<normal.length(); i++) {
			if(i!=0) {
				
			  
			if(array[i].contains("_")&&!(i+3>=array.length)) {
				
					
			
				
				String temp = array[i+1].toUpperCase();
				array[i+1]=temp;
				temp = array[i+2].toUpperCase();
				array[i+2]=temp;
				i+=3;
				
				
			}else if(normal.toUpperCase()==normal) {
				if(array[i].toUpperCase()==array[i]&&array[i-1].contains("_")) {
					i+=2;
				}
			}else if(array[i].toUpperCase()==array[i]&&!(i+2>=array.length)) {
				
				String temp = array[i+1].toUpperCase();
				array[i+1]=temp;
				i+=2;
			}
			}
			String temp = array[i].toLowerCase();
			array[i]=temp;
			
			
			
		}
		for(int i =0; i<array.length; i++) {
			if(array[i].contains("_")) {
				i++;
			}
			holder+=array[i];
		}
		/**for(int i =0; i<normal.length(); i++) {
			
			if(normal.substring(i)=="_"&&i!=0) {
				System.out.println(normal.substring(i));
				String temp = normal.substring(i+1).toUpperCase();
				normal.replace(normal.substring(i+1), temp);
				
				
			}
			if(normal.substring(i).toUpperCase()==normal.substring(i)&&i!=0) {
				String temp = normal.substring(i+1).toUpperCase();
				normal.replace(normal.substring(i+1), temp);
				i+=2;
			}
			String temp = normal.substring(i).toLowerCase();
			normal.replace(normal.substring(i), temp);
			//System.out.println
			//holder+=normal.substring(i);
			//holder+=normal.substring(i);
			
		}
		
		/**char[]array = normal.toCharArray();
		int teller =0;
		
		for(int i =0; i<array.length; i++) {
			if(normal.contains("_")) {
				if(normal.startsWith("_")) {
					if(Character.isUpperCase(array[i])==true&&i!=1) {
						char temp = Character.toUpperCase(array[i+1]);
						array[i+1]=temp;
						i+=2;
					}
					
				}else {
					if(array[i]=='_') {
						char temp=Character.toUpperCase(array[i+1]);
						array[i+1]=temp;
						temp = Character.toUpperCase(array[i+2]);
						array[i+2]=temp;
						i+=3;
					}
				}
			}else {
				if(Character.isUpperCase(array[i])&&i!=0) {
					char temp = Character.toUpperCase(array[i+1]);
					array[i+1]=temp;
					i+=2;
				}
				
			}
			char temp = Character.toLowerCase(array[i]);
			array[i]=temp;
		}
		/**if(normal.contains("_")) {
			if(normal.startsWith("_")) {
				for(int i =1; i<array.length; i++) {
					if(Character.isUpperCase(array[i])==true&&i!=1) {
					 char temp = Character.toUpperCase(array[i+1]);
					 array[i+1]=temp;
					 i+=2;
					}
				}
			}else {
			for(int i =0; i<array.length; i++) {
				
				char temp = Character.toLowerCase(array[i]);
				array[i]=temp;
				
				
				if(array[i]=='_'&&i!=0) {
					temp = Character.toUpperCase(array[i+1]);
					array[i+1]=temp;
					temp = Character.toUpperCase(array[i+2]);
					array[i+2]=temp;
					i+=2;
					
				}
				
			}}
			
		}else {
			for(int i =0; i<array.length; i++) {
				if(Character.isUpperCase(array[i])==true&&i!=0) {
					char temp = Character.toUpperCase(array[i+1]);
					array[i+1]=temp;
					i+=2;
				}
				char temp = Character.toLowerCase(array[i]);
				array[i]=temp;
				
						
			}
			
			
		}
		
		/**int teller =0;
		if(normal.contains("_")) {
			if(normal.toUpperCase()==normal) {
				while(array[teller]!='_'&&teller<=array.length) {
					char temp = Character.toLowerCase(array[teller]);
					array[teller]=temp;
					teller++;
					if(array[teller]=='_') {
						teller+=3;
					}
					
					
				}
			}
			
			if(normal.startsWith("_")) {
				teller=1; 
				while(Character.isUpperCase(array[teller])==false&&teller!=array.length) {
					char temp = Character.toLowerCase(array[teller]);
					array[teller]=temp; 
					teller++;
					if(Character.isUpperCase(array[teller])==true) {
					 temp = Character.toUpperCase(array[teller+1]);
					array[teller+1]=temp;
					teller+=2;
				}
				}
				
			}else {
				while(array[teller]!='_'&&teller!=array.length) {
					char temp = Character.toLowerCase(array[teller]);
					array[teller]=temp;
					teller++;
					if(array[teller]=='_') {
						temp = Character.toUpperCase(array[teller+1]);
						array[teller+1]=temp;
						temp=Character.toUpperCase(array[teller+2]);
						array[teller+2]=temp;
						teller+=3;
					}
				}
			}
		}else {
			if(Character.isUpperCase(array[0])==true) {
				char temp = Character.toLowerCase(array[0]);
				array[0]=temp;
				
			}
			for(int i =0; i<array.length; i++) {
				if(Character.isUpperCase(array[i])==true) {
					char temp = Character.toUpperCase(array[i+1]);
					array[i+1]=temp;
					i+=2;
				}
			}
			
		}**/
		for(int i =0; i<array.length; i++) {
			if(array[i].contains("_")) {
				i++;
			}
			holder+=array[i];
		}
		
		
	
		
		return holder;
	}

	// Given a string in various variable naming conventions, output that string in newWAveCAse. 
	// newWAveCAse is the practice of writing identifiers such that each word or abbreviation phrase, 
	// other than the first word, begins with two capital letters, with no intervening spaces or 
	// punctuation. The first word starts with a lowercase letter. For example, "Noah Rubin Salary"
	// in newWAveCAse would be written noahRUbinSAlary.

	//
	// sample data to copy into input stream
	// A_Variable_Name
	//
	// noah_rubin
	//
	// newWaveComputers
	//
	// _timeTravel
	//
	// TimeMachineWizard
	//
	// NEW_WAVE
	//
	// When you are finished, copy and paste the the entire contents of this file into the
	// dashboard to test your algorithm.

	public static void main(String[] args) {
		//String input = s.nextLine();                  // The string that needs to be converted.

		// code to solve the problem.  You can write and call other methods as well.

		System.out.println(scramble("NEW_WAVE"));                    // print your answer and just your answer.
	}

}
