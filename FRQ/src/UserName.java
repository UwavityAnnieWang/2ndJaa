import java.util.ArrayList;
import java.lang.Math;
public class UserName {
	private ArrayList<String>possibleNames;
	public UserName(String firstName, String lastName) {
		possibleNames = new ArrayList<>();
		for(int i =1; i<=firstName.length(); i++) {
			String temp = lastName.concat(firstName.substring(0,i));
			//System.out.println(temp);
			possibleNames.add(temp);
			
		
	}
		}
	
	
	public boolean isUsed(String name, String[]arr) {
		boolean temp = false;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==name) {
				temp=true;
				
			}
		}
		return temp;
	}
	public void setAvailableUserNames(String[] usedNames) {
		
		for(int i=possibleNames.size()-1; i>=0; i-- ) {
			if(this.isUsed(possibleNames.get(i), usedNames)==true) {
				possibleNames.remove(i);
			}
		}
		
	
		/**for(int i =0; i<usedNames.length; i++) {
			if(isUsed(usedNames[i],possibleNames)==true) {
				System.out.println("yes");
				possibleNames.remove(usedNames[i]);
			}
		}**/}
		
	}

