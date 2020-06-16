/**Set 3 
 * Wrapper Classes Project
 * @author Annie Wang
 *Date Started: 11/9/19 (I actually don't know ) 
 */
import java.util.Scanner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class WrapperClasses {
	
	//takes in a String(sentence), a String(word) to search for in the sentence
	//and a String(word) to replace the previous word(String)
	
	public static void replaceWith(String one,  String two, String three) {
		//String that will contain the edited version of the sentence 
		String well = " ";
		
		//ArrayList initialization,
		//this arraylist is used later in the method
		ArrayList<String>kirby = new ArrayList<>();
		//checks to see if the String contains the word
		if(one.contains(two)) {
			//splits the string
			 String[]fun = one.split(" ");
			 
			 //then adds the string to the arraylist 
			 for(int p =0; p<fun.length; p++) {
				  kirby.add(fun[p]);
				 
			 }
			 //checking arraylist for the word 
			 for(int y =kirby.size()-1; y>=0; y--) {
				 //replaces the keyword 
				 if(kirby.get(y).equalsIgnoreCase(two)) {
					 kirby.set(y, three);
				 }
			 }
			 //puts the edited version into a String 
			 for(String poyo: kirby) {
				 well+=poyo + " ";
			 }
			 //returns that String's substring due to it being initialized as
			 //equaling " "
			 System.out.println(well.substring(1));
		
					
					 
					 
				 
				
			 }else {//else statement for what happens if the sentence doesnt
				 //contain that word 
				 
				 System.out.println("This String does not contain that word");
			 }
			 
			
				 }
			 
			
			 
			
			 
			
			
			
			
			
	//takes in a string and then makes all lowercase capital and all capital
	//lowercase, also gets rid of spaces and changes all lowercase 'e' instances to
	//'i' and all uppercase E instances to 'O'
	public static void mixUp(String unknown) {
		//String that will contain the edited String 
		String yay = " ";
		int bruh = 0;
		//arraylist that all the values of the String will be put into 
		ArrayList<String>why = new ArrayList<>();
		
		
		//putting all values in the string into the arraylist
		for(int p=0; p<unknown.length(); p++) {
			why.add(unknown.substring(p, p+1));
			
			}
		//gets rid of spaces
		for(int k =why.size()-1; k>=0; k--) {
			bruh+=why.get(k).charAt(0);
			if(why.get(k).isBlank()) {
				why.remove(k);
			}
		}
		//changes uppercase to lowercase and vice versa 
		for(int x =0; x<why.size(); x++) {
			if(why.get(x).toUpperCase().equals(why.get(x))) {
				why.set(x, why.get(x).toLowerCase());
			}
			else if(why.get(x).toLowerCase().equals(why.get(x))) {
				why.set(x, why.get(x).toUpperCase());
			}
			
		}
		
		
		
		//changes all instances of lowercase e into i and 
		//uppercase E into O
		for(int p=why.size()-1; p>=0; p--) {
			
			if(why.get(p).equalsIgnoreCase("e")) {
				if(why.get(p).toLowerCase().equals(why.get(p))) {
					why.set(p, "i");
				}else {
					why.set(p, "O");
		}
				}
			}
		
		
		//putting all the values of the arraylist into the string
		for(String doot: why) {
			yay+=doot;
			//bruh+=(int)doot.charAt(0);
			
		}
		//printing the modified String
		System.out.println(yay.substring(1));
		System.out.println(bruh);
			
			
			
		}
	
	//sort words in a String alphabetically 
		public static void sort(String apple) {
			String bing;
			String[]wow = apple.split(" ");
			ArrayList<String>red = new ArrayList<>();
			
		//compares to the previous string, if the previous string is "earlier"
			//alphabetically, moves it up
			for(int b =0; b<wow.length; b++) {
				for(int d = b+1; d<wow.length; d++) {
					if(wow[b].compareToIgnoreCase(wow[d])>0) {
						bing=wow[b];
						wow[b]=wow[d];
						wow[d]=bing;
					}
				}
			}
			//puts it in arraylist
			for(String lead: wow) {
				red.add(lead);
				
			}
			//prints out arraylist
				System.out.println((red)+" ");
			
			
			
			
			
		}
		
		
		
		
		
			
			
			
			
			
		
		
		
		
	//main 
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		//menu asks for which method you want to use 
		System.out.println("Press a number for which method you want to use");
		System.out.println("1: replace with");
		System.out.println("2: mixup method");
		System.out.println("3: Sort method ");
		System.out.println("Press nine to get out of the loop");
		
		int something = s.nextInt();
		while(something!=9) {
			//switch statement 
			switch(something) {
			case 1:
				System.out.println("Please input a sentence/paragraph:");
				String first = s.next();
				String addOn = s.nextLine();
				//First String that is taken in by method 
				String oof = first.concat(addOn);
				System.out.println("Now input a word");
				//second String that is taken in by method 
				String second = s.next();
				System.out.println("Now input another word");
				//third String that is taken in by method 
				String third = s.next();
				System.out.println("here is your sentence/paragraph before:");
				System.out.println(oof);
				System.out.println("here is your sentence/paragraph now:");
				replaceWith(oof, second, third);
				//asks if you want to continue
				System.out.println("do you want to continue?");
				System.out.println("1: replace with");
				System.out.println("2: mixup method");
				System.out.println("3: Sort method ");
				System.out.println("Press nine to get out of the loop");
				something=s.nextInt();
				
				
				
				
				
				break;
			case 2:
				System.out.println("Mixup method");
				System.out.println("Type in any amount of gibberish ");
				String uh = s.next();
				String oh = s.nextLine();
				//String that is taken in by method 
				String stinky = uh.concat(oh);
				mixUp(stinky);
				//asks if you want to continue 
				System.out.println("do you want to continue?");
				System.out.println("1: replace with");
				System.out.println("2: mixup method");
				System.out.println("3: Sort method ");
				System.out.println("Press nine to get out of the loop");
				something = s.nextInt();
				
				break;
				
			case 3:
				System.out.println("Type in a paragraph/sentence");
				String lavender = s.next();
				String towne = s.nextLine();
				//String that is taken in by method
				String lavendertowne = lavender.concat(towne);
				sort(lavendertowne);
				//asks if you want to continue 
				System.out.println("do you want to continue?");
				System.out.println("1: replace with");
				System.out.println("2: mixup method");
				System.out.println("3: Sort method ");
				System.out.println("Press nine to get out of the loop");
				something = s.nextInt();
				
				
			}
			break;	
		
		
		
		}
		//what happens when you exit the loop 
		if(something==9) {
			System.out.println("You have exited the loop");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
