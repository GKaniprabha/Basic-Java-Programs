package javaTest;

public class factorial {
 
	public static void main(String[] args) {
		int num=4;
		int fac=1;//1
		for(int i=1;i<=num;i++) {
			//start=1; 1,2,3,4
			fac=fac*i;
			//1*1=1
		}
		System.out.println(fac);
	}

}
