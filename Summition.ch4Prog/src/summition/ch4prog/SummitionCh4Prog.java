package summition.ch4prog;
import java.util.Scanner;
public class SummitionCh4Prog 
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
        int s=0;
        int n=1;
        while(n<=10 )
        {    
         s=s+n ;
         n=n+1 ;
        }     
         System.out.print(s);
    }
    
}
