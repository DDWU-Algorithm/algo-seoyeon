import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num, count = 0;
		
		for(int i = 0; i < n; i++) {
		    num = sc.nextInt();
		    if(num > 1 && isPrime(num) == true) {
		        count++;
		    }
		}
		System.out.println(count);
	}
	
	public static boolean isPrime(int n) {
	    for(int i = 2; i <= Math.sqrt(n); i++) {
	        if(n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
