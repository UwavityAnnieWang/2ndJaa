import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

//use substring for the username thing

public class Payroll {
	private int[] itemsSold;
	private double[] wages;
	public Payroll(int[]one) {
		itemsSold=one;
		
	}
	
	
	public  double computeBonusThreshold() {
	    int min =itemsSold[0];
	    int max = 0;
		
		double threshold=0;
		
		for(int i =0; i<itemsSold.length; i++) {
			if(itemsSold[i]<min) {
				min=itemsSold[i];
			}
			if(itemsSold[i]>max) {
				max=itemsSold[i];
			}
			threshold+=itemsSold[i];
			
		}
		threshold-=(min+max);
		threshold/=itemsSold.length-2;
		
		
		return threshold;
		
	}
	public  void computeWages(double fixedWage, double perItemWage) {
		wages = new double[itemsSold.length];
		for(int i =0; i<itemsSold.length; i++) {
			
			double wage = fixedWage + (itemsSold[i]*perItemWage);
			if(itemsSold[i]>=computeBonusThreshold()) {
				wage*=1.1;
			}
			
			wages[i]=wage;
			System.out.println(wages[i]);
		}
		
	}
	
}
