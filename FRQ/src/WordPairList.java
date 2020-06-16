import java.util.ArrayList;
public class WordPairList {
	private ArrayList<WordPair> allPairs;
	public WordPairList(String[]words) {
		allPairs=new ArrayList<WordPair>();
		
		
		for(int i =0; i<words.length; i++) {
			for(int j =i+1; j<words.length; j++) {
				WordPair temp = new WordPair(words[i],words[j]);
				allPairs.add(temp);
			}
		}
		
	}
	public int numMatches() {
		int counter =0;
		/**for(int i =allPairs.size()-1; i>=0; i--) {
			if(allPairs.get(i).getFirst()==allPairs.get(i).getSecond()) {
				counter++;
			}
		}**/
		for(WordPair pair: allPairs) {
			if(pair.getFirst()==pair.getSecond()) {
				counter++;
			}
		}
		return counter;
		
	}

}
