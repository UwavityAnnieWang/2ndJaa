
public class why {
	
	
	public static void adjust(double max, double min, double total, double n)

	{

	total = total - max - min;

	n = n - 2.0;

	System.out.println(total / n);

	}
	public static void main(String[]args) {
		int[ ][ ] data = {{9, 17, -4, 21 },
                {15, 24, 0, 9},
                {6, 2, -56, 8},
               };
		System.out.println(data[1][2]);
	}

}
