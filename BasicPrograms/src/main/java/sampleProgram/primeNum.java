package sampleProgram;

public class primeNum {
	int[] numbers = {5,100};  
	//boolean flag=false;
	
	public void primeMethod() {
			for(int i=0; i<numbers.length;i++) {
				for(int j=2; j<numbers[i]-1;j++) {
					System.out.println(numbers[i]-1);
					if(numbers[i]%j==0) {
						System.out.println(numbers[i]+": NOT--PRIME");
						break;
					}else {
						System.out.println(numbers[i]+": PRIME");
						break;
					}
				}
			}
	}
//	public void method2() {
//		int primeNum=35;
//		for(int z=2; z<=primeNum-1;z++) {
//			if(primeNum%z==0) {
//				System.out.println(primeNum+": Number is Not Prime.");
//				break;
//			}else {
//				System.out.println(primeNum+": PRIME.");
//				break;
//			}
//		}
//	}
	public static void main(String[] args) {
		primeNum obj = new primeNum();
		obj.primeMethod();
		//obj.method2();
		
	}

}
