package palindrome1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class arraysum {
	public static void main(String[] args)  {
        int n;
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        n=s.nextInt();
     try {
        int []a=new int[n];
        for(int i = 0; i < n; i++)
        {
           a[i] = s.nextInt();
          sum=sum+a[i];
        }
        System.out.println("Sum:"+sum);
   
 }  
    catch(Exception e) {
       
        System.out.println("invalid input");
    }
   
}
}

