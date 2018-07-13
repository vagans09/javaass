package palindrome1;
import java.util.Scanner;

public class stack {
public static void main (String[] args) {
	String sg;
	int n;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the text");
	sg = s.nextLine();
	System.out.println("enter the value");
	n = s.nextInt();
	int m=sg.length();
	int p= m-n;
	for (int i=0; i< m; i++ ) {
		System.out.print(sg.charAt(i));
	}
	for (int i=p;i<m;i++) {
		for(int j=p;j<m;j++) {
		System.out.print(sg.charAt(j));
	}
}
}
}
