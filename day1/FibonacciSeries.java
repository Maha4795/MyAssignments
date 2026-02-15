package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int range = 8;
    int a = 0, b = 1;
    System.out.print("Fibonacci Series: ");;
    for (int i = 1;i <=range; i++) {
    	System.out.print(a+ " ");;
    	
    	int next = a+b;
    	a = b;
    	b = next;
    }
	}

}
