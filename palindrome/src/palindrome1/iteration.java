package palindrome1;
import java.util.Scanner;
public class iteration {
	public static void main(String[] args) {
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		n = s.nextInt();
		for(i=1; i<= n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(+i);
			}
		}
	}

}
