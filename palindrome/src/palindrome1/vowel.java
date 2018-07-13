package palindrome1;
import java.util.Scanner;
public class vowel {
	public static void main(String[] args) {
		char ch;
		String st,r;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the word : ");
		st = s.nextLine();
		try {
	        Integer.parseInt(st);
	        System.out.println("invalid");
	    }
	    catch(NumberFormatException e)
	    {
	    for(int i=0;i<st.length();i++)
	    {
		ch = st.charAt(i);
		if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
		{ 
			System.out.print("vowels");
		}
		else 
		{
			System.out.print("constants");
		}
		
	}

}
	}
}
