import java.util.ArrayList;
public class Digits {
	private ArrayList<Integer>digitList;
	public Digits(int num) {
	/**char[]array = Integer.toString(num).toCharArray();
	for(int i =0; i<array.length; i++) {
		digitList.add(Integer.getInteger(Character.toString(array[i])));
	}**/
	//System.out.println(Integer.parseInt(Integer.toString(num)));
	digitList=new ArrayList<>();
	if(num==0) {
		digitList.add(num);
	}else {
		while(num%10!=0) {
			digitList.add(0, num%10);
			
			num/=10;
			
		}
		//System.out.println(digitList);
	}
		
	}
	public boolean isStrictlyIncreasing() {
		for(int i =0; i<digitList.size(); i++) {
			if(digitList.get(i)>digitList.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	

}
