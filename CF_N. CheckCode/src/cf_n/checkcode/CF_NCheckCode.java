package cf_n.checkcode;
import java.util.Scanner;
public class CF_NCheckCode {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
       int a = sc.nextInt();
       int b = sc.nextInt();
       String s = sc.next();
  
    if(s.charAt(a) != '-')
    {
       System.out.println("No");
       return;
    }
             int cntr = 0;
      for(int i=0 ; i < s.length() ; i++) 
      {
         if( (s.charAt(i) >= '0' && s.charAt(i) <= '9') && i != a )
              cntr++;
      }
      
          if(cntr == a+b) 
          System.out.println("Yes");
          else 
          System.out.println("No");   
  }   
}
