package week1.day1;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 121;
		int output = 0;
		int rem;
		
		for (int i = input; i>0 ; i = i / 10) {
			rem = i%10;
			output = (output * 10) + rem;
			
		}
 if (input == output) {
	 System.out.println(input + " is a Palindrome");
 }
 else {
	 System.out.println(input + " is not a Palindrome");
	 
 }
	}

}
