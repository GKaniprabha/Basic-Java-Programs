package sampleProgram;

import java.util.Scanner;

public class simpleCalculator {
//	public int add(int a, int b) {
//		return a+b;
//	}
//	public int sub(int a, int b) {
//		return a-b;
//	}
//	public int mul(int a, int b) {
//		return a*b;
//	}
//	public int div(int a, int b) {
//		return a/b;
//	}
//	public int quotient(int a, int b) {
//		return a%b;
//	}
//	
//	public static void main(String[] args) {
//		simpleCalculator obj = new simpleCalculator();
//		System.out.println("Addition: "+obj.add(15, 15));
//		System.out.println("Subraction: "+obj.sub(50, 25));
//		System.out.println("Multiply: "+obj.mul(10, 10));
//		System.out.println("Division: "+obj.div(100, 10));
//		
//	}
	public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args){
    	simpleCalculator operation = new simpleCalculator();
        System.out.println("Simple Calculator: ");
        System.out.println("Select an Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Scanner scanner = new Scanner(System.in);
        int wish = scanner.nextInt();
        if(wish == 1 || wish == 2 || wish == 3 || wish == 4){
            System.out.println("Type a First number: ");
            int a = scanner.nextInt();
            System.out.println("Type a Second number: ");
            int b = scanner.nextInt();
            if(wish == 1){
                System.out.println(add(a,b));
            }
            if(wish == 2){
                System.out.println(sub(a,b));
            }
            if(wish == 3){
                System.out.println(mul(a,b));
            }
            if(wish == 4){
                System.out.println(div(a,b));
            }
        }
        else{
            System.out.println("Invalid Selector");
        }
    }

}

