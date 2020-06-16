
public class IntegerAnalysis {
	public static double analyzeInts(int max, int n) {
		int proportion = 0;
		for(int i=0; i<n; i++) {
			int temp = getInt();
			if(temp<max&&temp>0) {
				proportion++;
			}
		}
		return (double)proportion/n;
		
	}

}
