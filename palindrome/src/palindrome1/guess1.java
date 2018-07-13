package palindrome1;
import java.util.Scanner;
public class guess1 {
public static void main(String[] args) {
	int a=45, n;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number");
	n = s.nextInt();
	if(n == a) {
		System.out.println("guessed number is original number");
	}
	else if (n > a) {
		System.out.println("greater than original number");
	}
	else if ( n < a) {
		System.out.println("smaller than original number");
	}
}
}
