package sampleProgram;

public class ReverseString {
	public static void main(String[] args) {
		String orginalString = "Hello World";
		String reverse = "";
		System.out.println("OrginalString: "+orginalString);
		for(int i=0; i<orginalString.length();i++) {
			reverse =orginalString.charAt(i)+ reverse ;    			
		}
		System.out.println("ReversedString: "+reverse);
		boolean confirm = reverse.isEmpty();
		System.out.println("IsEmpty: "+confirm);
	}

}
