package palindrome1;
import java.util.Scanner;

public class Palindrome1 {
	public static void main(String[] args) {
		long r,sum = 0, result = 0, n, temp, even = 0;
	
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number : ");
		n = s.nextLong();
		temp = n;
		while (n>0) {
			r = n % 10;
			  if(r %2 == 0)
		       {
		    	 even = even + r;  
		       }
			sum = (sum*10)+r;
			n = n / 10; 
		} 
	   
	 if(temp == sum && even > 25)
		{
			System.out.print("entered number is palindrome and sum is more than 25 ");
			
		}
		else {
			System.out.print("entered number is a palindrome and sum is less than 25");
		}
	 }
}


