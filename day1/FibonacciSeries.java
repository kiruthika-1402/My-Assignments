package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 6;
		
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);

	//             1      2      7
		for (int i = 0; i < n ; i++) {
			
	//               3		
			int c = a+b;
			
	//               4		
			System.out.println(c);
	//       5		
			a=b;
			
	//       6		
			b=c;		
		}	
		
	}

}
