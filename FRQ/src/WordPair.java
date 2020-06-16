import java.util.ArrayList;
public class WordPair {
	private String one, two;
	

	public WordPair(String first, String second) {
		one=first;
		two=second;
		System.out.println(one + " " + two);
		
	}
	public String getFirst() {
		return one;
	}
	public String getSecond() {
		return two;
	}
}
