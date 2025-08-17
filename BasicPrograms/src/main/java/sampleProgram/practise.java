package sampleProgram;

import java.util.Scanner;

public class practise {
	
	public static void main(String[] args) {
		int a=10;
		System.out.println(a++ + ++a);
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your Name?");
		String name =scanner.nextLine();
		System.out.println("Hi "+name);
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println("*");			
		}
	}

}
