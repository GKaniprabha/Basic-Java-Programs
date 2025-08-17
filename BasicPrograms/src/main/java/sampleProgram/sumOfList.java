package sampleProgram;

import java.util.ArrayList;
import java.util.List;

public class sumOfList {
	static int sum=0;
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(5);
		num.add(5);
		num.add(5);
		num.add(80);
		for(int i=0;i<num.size();i++) {
			sum =sum+num.get(i);
		}
		System.out.println("Sum of the List: "+sum);
	}
	
}
