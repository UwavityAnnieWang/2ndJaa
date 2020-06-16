/**Date: 10/22/19
 * Author:Annie Wang 
 * Main for purpose of testing playlist class
 * Has while loop so that user can continuously modify their playlist until they choose not to
 * 
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class PlayListMain {
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		//default playlist 
		PlayList wrow = new PlayList();
		
		System.out.println("Do you want to modify your playlist?");
		System.out.println("Y for yes, any other letter for no");
		char choose = s.next().charAt(0);
		//Loop to run playlist methods in 
		while(choose=='Y'||choose=='y') {
			//Rename List 
			System.out.println("Do you want to change the name of your playlist?");
			System.out.println("The default name of your playlist is " + wrow.getName());
			System.out.println("Press Y for yes, anything else for no");
			char another = s.next().charAt(0);
			if(another=='Y'||another=='y') {
				System.out.println("input the name you want for your playlist");
				String something = s.next();
				String leMonke = s.nextLine();
				String stinky = something + leMonke;
				wrow.RenameList(stinky);
				//Also uses getName 
				System.out.println("The new name is:" + wrow.getName());
				
			}else {
				System.out.println("Ok. Moving on");
			}
			//add(song)
			System.out.println("Do you want to add a song to your playlist?");
			System.out.println("Click Y for yes, any other letter for no");
			char alph = s.next().charAt(0);
			if(alph=='Y'||alph=='y') {
				System.out.println("Please input the name of your song below");
				String tink = s.next();
				System.out.println("Please input the name of the artist of your song now:");
				String nice = s.nextLine();
	    		String whew = s.next();
	    		String guh = s.nextLine();
	    		System.out.println("Input the rating of your song:");
	    		int minion = s.nextInt();
	    		String well = tink + nice;
	    		String guess = whew+guh;
	    		Song gru = new Song(well, guess, minion);
	    		if(wrow.add(gru)==true) {
	    			System.out.println("You have successfully added a song");
	    			for(Song inosuke: wrow.getSongs()) {
	    				System.out.println(inosuke);
	    			}
	    			//if the playlist is full then it displays this message
	    		}else {
	    			System.out.println("You need to remove a song or enlarge your playlist");
	    		}
				
			}else {
				System.out.println("Ok. Moving on");
			}
			//remove song 
			System.out.println("Do you want to remove a song from your playlist?");
			System.out.println("Press Y for yes and any other letter for no");
			char ImGettingSickOfNamingStuff = s.next().charAt(0);
			if(ImGettingSickOfNamingStuff=='Y'||ImGettingSickOfNamingStuff=='y') {
				System.out.println("Alright here's your playlist for reference");
				
				for(Song booyah: wrow.getSongs()) {
					System.out.println(booyah);
				}
				
				System.out.println("Type in the name of the song you want removed");
				String reol = s.next();
				String bugs = s.nextLine();
				String boom = reol+bugs;
				wrow.RemoveSong(boom);
				System.out.println("your playlist without " + reol);
				
				for(Song trunks: wrow.getSongs()) {
					System.out.println(trunks);
				}
				
			}else {
				System.out.println("Ok. Moving on");
			}
			//swap song
			System.out.println("Do you want to swap two songs?");
			System.out.println("Click Y for yes, any other letter for no");
			char judy = s.next().charAt(0);
			if(judy=='Y'||judy=='y') {
				System.out.println("Input the indexes of the two songs you want swapped");
				System.out.println("Here is reference:");
				for(Song goku: wrow.getSongs()) {
					System.out.println(goku);
				}
				int won = s.nextInt();
				int too = s.nextInt();
				while(won>wrow.getSongs().size()||too>wrow.getSongs().size()) {
					System.out.println("Out of bounds, please try again");
					won =s.nextInt();
					too = s.nextInt();
				}
				wrow.Swap(won, too);
				System.out.println("Here's your playlist with the swapped songs:");
				for(Song vegeta: wrow.getSongs()) {
					System.out.println(vegeta);
				}
				
			}else {
				System.out.println("Ok. Moving on");
			}
			//remove song(artist)
			System.out.println("Do you want to remove songs by a particular artist?");
			System.out.println("Click Y for yes, any other letter for no");
			char broly = s.next().charAt(0);
			if(broly=='Y'||broly=='y') {
				System.out.println("Here is your playlist for reference:");
				for(Song dragonBall: wrow.getSongs()) {
					System.out.println(dragonBall);
				}
				System.out.println("Please input the name of the artist you want removed below:");
				String artOne = s.next();
				String artTwo = s.nextLine();
				String deku = artOne + artTwo;
				wrow.RemoveArtist(deku);
				System.out.println("Your playlist without " + deku);
				for(Song begeta: wrow.getSongs()) {
					System.out.println(begeta);
				}
			}else {
				System.out.println("Ok. Moving on");
			}
			//remove song(num stars) 
			System.out.println("Do you want to remove songs that are lower than a particular rating?");
			System.out.println("Press Y for yes, any other key for no");
			char uraraka = s.next().charAt(0);
			if(uraraka=='Y'||uraraka=='y') {
				System.out.println("Your playlist:");
				for(Song noPower: wrow.getSongs()) {
					System.out.println(noPower);
				}
				System.out.println("Input your cutoff rate below:");
				int bakugoi = s.nextInt();
				wrow.removeLowStars(bakugoi);
				for(Song kacchan: wrow.getSongs()) {
					System.out.println(kacchan);
				}
				
				
			}else {
				System.out.println("Ok. Moving on");
			}
			//get Songs(artist)
			System.out.println("Do you want to get songs by a particular artist?");
			System.out.println("Choose y for yes, any other letter for no");
			char todoroki = s.next().charAt(0);
			if(todoroki=='Y'||todoroki=='y') {
				for(Song gabe: wrow.getSongs()) {
					System.out.println(gabe);
				}
				System.out.println("Please input the name of the artist below:");
				String shouto = s.next();
				String izuku = s.nextLine();
				String ship = shouto + izuku;
				System.out.println(wrow.getSongs(ship));
				
			}else {
				System.out.println("Ok. Moving on");
			}
			//number songs(artist)
			System.out.println("Do you want to get the number of songs by an artist?");
			System.out.println("Input Y for yes, any other key for no");
			char katsuki = s.next().charAt(0);
			if(katsuki=='Y'||katsuki=='y') {
				for(Song inasa: wrow.getSongs()) {
					System.out.println(inasa);
				}
				System.out.println("Please input the name of the artist below:");
				String froppy = s.next();
				String floppy = s.nextLine();
				String fog = froppy + floppy;
				System.out.println("The number of songs by " + fog + " is " + wrow.numSongsByArtist(fog));
			}else {
				System.out.println("Ok. Moving on");
			}//Average rating 
			System.out.println("Do you want the average rating of all the songs in the playlist?");
			System.out.println("Press Y for yes, any other key for no");
			char giyuu = s.next().charAt(0);
			if(giyuu=='Y'||giyuu=='y') {
				System.out.println("The average star rating is " + wrow.averageRating());
			}else {
				System.out.println("Ok. Moving on");
			}//SpacesLeft 
			System.out.println("Do you want to get the number of spaces left in your playlist?");
			System.out.println("Press Y for yes, any other key if not");
			char yuzuru = s.next().charAt(0);
			if(yuzuru =='Y'||yuzuru=='y') {
				System.out.println("The number of spaces left in your playlist is " + wrow.spacesLeft());
				
			}else {
				System.out.println("Ok. Moving on");
			}//ToString 
			System.out.println("Do you want the toString to the Playlist?");
			System.out.println("Press Y for yes and any other key if not");
			char lio = s.next().charAt(0);
			if(lio=='Y'||lio=='y') {
				System.out.println(wrow.toString());
			}else {
				System.out.println("Ok. Moving on");
			}
			//Clear list 
			System.out.println("Do you want to clear your list?");
			System.out.println("Press Y for yes, any other key if not");
			char kirby = s.next().charAt(0);
			if(kirby=='Y'||kirby=='y') {
				wrow.ClearList();
				System.out.println("Your list has been cleared");
			}else {
				System.out.println("Ok. Moving on");
			}
			//Asks if you want to continue
			System.out.println("Now do you want to continue?");
			System.out.println("Press Y for yes, any other key for no");
			choose = s.next().charAt(0);
			
				
			
			
			
			
		}//statement excuted if you exit the while loop 
		if(choose!='Y'||choose!='y') {
			System.out.println("You have exited the program");
		}
			
		
		
		
		
		
		
		
		
	
	        
	       
	        
	       
	        
	        
	        
		
		
		
	}

}
