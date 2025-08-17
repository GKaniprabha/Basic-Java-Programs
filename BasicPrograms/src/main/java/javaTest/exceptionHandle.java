package javaTest;

public class exceptionHandle {
	public static void main(String[] args) {
		int a = 8;
		int b =0;
		int c; 
		try{
			c= a/b;
		}
		catch(ArithmeticException e) {
			throw e;
		}
	}

}
