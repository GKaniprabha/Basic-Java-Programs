package javaTest;

public class FibSeries {
	
	public static void main(String[] args) {
		int n = 10, a = 1, b = 2;
		System.out.println("FibSeries till "+ n+" terms.");
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.print(a + ", ");
			int c = a+b;
			a = b;
			b = c;
		}
	}

}
