package javaTest;

import java.util.HashSet;

public class ArrayDup {

	int[] num = {1,2,5,6,5,2,8,9,5,2,4,9,5};
	
	public void method() {
		HashSet<Integer> duplicates = new HashSet<Integer>();
		//HashSet<Integer> printed = new HashSet<Integer>();

		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] == num[j]) {
					duplicates.add(num[j]);
				}
			}
		}

		for(int dup : duplicates) {
			System.out.println("Duplicate Value: " + dup);
		}
	}

	public static void main(String[] args) {
		ArrayDup obj = new ArrayDup();
		obj.method();
	}
}
