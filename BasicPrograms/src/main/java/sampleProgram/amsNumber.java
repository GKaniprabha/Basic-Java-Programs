package sampleProgram;

public class amsNumber {
	public static void main(String[] args) {
	     int Number = 153, Remainder, Orginalnumber, sum=0;
	     
	     Orginalnumber=Number;
	     while(Orginalnumber!=0) {
	    	 Remainder = Orginalnumber%10;
	    	 sum += Math.pow(Remainder, 3);
	    	 Orginalnumber /= 10;
	     }
	     if(Number==sum) {
	    	 System.out.println("Amstrong Number");
	     }else {
	    	 System.out.println("Normal Number");
	     }
	}

}
