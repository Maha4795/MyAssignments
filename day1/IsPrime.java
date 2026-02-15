package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10; // given number
		boolean isPrime = true;
		
		if (num <=1) {
			isPrime = false;
		}else {
			for (int i =2; i<= num-1; i++) {
				if(num % i ==0){
					isPrime = false;
					break;
				}
			}
		}
		
		if (isPrime) {
			System.out.println(num + " is a Prime number");
		}else {
			System.out.println(num + " is not a Prime number");
		}
	
		
		

	}

}
