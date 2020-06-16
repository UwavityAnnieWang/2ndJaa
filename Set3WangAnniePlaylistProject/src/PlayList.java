/**Date written:10/22/19
 * Author:Annie Wang 
 * PlayList Project 
 * Takes in a Song ArrayList, a int max number of songs, and a name for the playlist 
 * 
 */
import java.util.ArrayList;
import java.lang.Math;
public class PlayList {
	//three instance variables 
	private ArrayList<Song>Spotify;
	private int maxNum;
	private String title;
	//default constructor 
	public PlayList() {
		Spotify = new ArrayList<Song>();
		//default arraylist 
		Spotify.add(new Song("Twinkle, Twinkle Little Star", "The Muffin Man", 4));
        Spotify.add(new Song("I’ve Been Working on the Rail Road", "Justin Beiber", 0));
        Spotify.add(new Song("Puff the Magic Dragon", "Puff Daddy", 5));
        Spotify.add(new Song("You are My Sunshine", "The Muffin Man", 5));
        Spotify.add(new Song("Moo, Bah, La La La", "The Muffin Man", 3));
        Spotify.add(new Song("Bingo", "Justin Beiber", 0));
        Spotify.add(new Song("This Old Man", "Puff Daddy", 2));
        Spotify.add(new Song("Alphabet Song","Puff Daddy", 4));
        Spotify.add(new Song("9 Lb Hammer", "The Muffin Man", 3));
        Spotify.add(new Song("Froggy Went A-Courtin", "Justin Beiber", 0));
        Spotify.add(new Song("Moon", "The Muffin Man", 4));
        Spotify.add(new Song("You Don’t Know the Muffin", "Man The Muffin Man", 5));

		this.maxNum=20;
		this.title="Playlist 1";
		
		
	}
	public PlayList(ArrayList<Song>one, int two, String three) {
		this.Spotify=one;
		this.maxNum=two;
		this.title=three;
		}
	
	
	
	
	
	
	
	//swaps two songs
	//Works
	public void Swap(int one, int two) {
		Song something = Spotify.get(two);
		Spotify.set(two, Spotify.get(one));
		Spotify.set(one, something);
				
		
		
		
	}
	//renames playlist 
	//Works
	public void RenameList(String name) {
		title = name;
	
		
	}
	//clears the playlist
	//Works
	public void ClearList() {
	Spotify.clear();	
		
		
		
	}//removes song
	//Works
	public void RemoveSong(String nerd) {
		for(int y = Spotify.size()-1; y>=0; y--) {
			if(Spotify.get(y).getTitle().equals(nerd)) {
				Spotify.remove(y);
			}
		}
		/**for(Song songs: Spotify) {
			if(songs.getTitle().equals(nerd)) {
				Spotify.remove(songs);
			}
		}**/
		
		
	}//removes artist 
	//Works
	public void RemoveArtist(String artist) {
		
		for(int p =Spotify.size()-1; p>=0; p--) {
			
			if(Spotify.get(p).getArtist().equals(artist)) {
				
				Spotify.remove(p);
				
			}
		}
		
		
	}//removes low stars 
	//Works
	public void removeLowStars(int cutOff) {
		//use enhanced for loop
		for(int k =Spotify.size()-1; k>=0; k--) {
			if(Spotify.get(k).getStars()<cutOff) {
				Spotify.remove(k);
			}
		}
	}//adds song if added to the size the size is less than max num
	//Works
	public boolean add(Song wii) {
		int oof = Spotify.size();
		if(oof<=maxNum) {
			Spotify.add(wii);
			return true;
			
		}
		
		else;
		return false;
	}
	
	//gets name
	//Works
	public String getName() {
		return title;
	}
	
	
	//gets songs with the specified artist 
	//Works 
	public ArrayList<Song> getSongs(String artist){
		ArrayList<Song>blue = new ArrayList<Song>();
		for(Song songs: Spotify) {
			if(songs.getArtist().equals(artist)) {
				blue.add(songs);
				
			}
		}
		return blue;
	}
	//returns number of spaces left 
	//Works
	public int spacesLeft() {
		int count = maxNum;
		if(Spotify.isEmpty()) {
			return maxNum;
		}
		else;
		for(Song songs: Spotify) {
			
			count--;
			
		}
	
		return count;
	}
	
	
	//returns number of songs by specified artist
	//Works
	public int numSongsByArtist(String musician) {
		int count = 0;
		for(Song songs: Spotify) {
			if(songs.getArtist().equals(musician)) {
				count++;
			}
		}
	return count;
	}
	
	//returns average rating of songs in playlist 
	//Works
	public double averageRating() {
		int something = 0;
		for(int i =0; i<Spotify.size(); i++) {
			something+=Spotify.get(i).getStars();
		}
		something=something/Spotify.size();
		return something;
	}
	//returns arraylist of all songs 
	//works
	public ArrayList<Song> getSongs(){
		/**for(Song songs: Spotify) {
			System.out.println(songs);
		}**/
		
		return Spotify;
	}
	//to String
	//Works
	public String toString() {
		return "Name: "+ title + " Length of Playlist: " + maxNum + Spotify;
	}
	
	
	
	
	
	
	
	
	

}
