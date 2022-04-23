package cf_p.factorial.digits;
import java.util.Scanner;
public class CF_PFactorialDigits {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
       int n = sc.nextInt();     
       double res = 0; 
               
      for(int i=2 ; i<=n ; i++)
      {
        res += Math.log10(i);
      }
      
    System.out.print("Number of digits of " + n + "! is " + ((int)res+1));
    
    
  
  }
    
}
