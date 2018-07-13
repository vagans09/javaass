package palindrome1;
import java.util.Scanner;
public class chartype {
	public static void main(String[] args) {
	char ch;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the character : ");
	ch = s.next().charAt(0);
	if (ch>=65 && ch<=90) {
		System.out.print("capital letter");}
	else if (ch>=97 && ch<=122) {
		System.out.print("small letter");
	}
	else if (ch>=48 && ch<=57) {
		System.out.print("digit");
	}
	else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
            (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
	{
		System.out.print("special symbol");
	}
	
	}

}
