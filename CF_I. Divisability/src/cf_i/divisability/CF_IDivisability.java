package cf_i.divisability;
import java.util.Scanner;
public class CF_IDivisability {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    Long a = sc.nextLong();
    Long b = sc.nextLong();   
    Long x = sc.nextLong();
    Long n;

    if(a>b)
    {
      Long temp = b;
      b = a;
      a = temp;
    }

       b/=x;
	a--;
        n=a/x;
	
      System.out.println( ((b*(b+1)/2) - (n*(n+1)/2)) *x );
 
  }
    
}
