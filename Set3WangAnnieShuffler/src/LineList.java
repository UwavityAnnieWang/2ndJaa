/**LineList project 
 * Author: Annie Wang
 * Takes in an ArrayList, methods are size, 
 * get, add, remove, move and shuffle 
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class LineList {
	private ArrayList<String>thing;
	public LineList(ArrayList<String>lines) {
		thing = lines;
	}
public int size() {
	return thing.size();
}
public String get(int k) {
	return thing.get(k);
}
public void AddTo(String word) {
	thing.add(word);
}
public String GetRid(int p) {
	thing.remove(p);
	return thing.get(p);
}
public void move(int one, int two) {
	
	thing.set(two, thing.get(one));
	
	
	
}
public void swap(int one, int two) {
	//for shuffle method 
	String uh = thing.get(one);
	thing.set(one, thing.get(two));
	thing.set(two, uh);
}

public void shuffle() {
	//shuffly dee
	int n = thing.size()-1;
	while(n>=2) {
	swap((int)Math.random()*n, n);
	n-=1;
	}
	
	
	
	
}

	
	
	
}

