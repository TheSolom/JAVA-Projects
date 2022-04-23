package cf_i.palindrome;
import java.util.Scanner;
public class CF_IPalindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
      String S = sc.next();
       int cntr = 0;    
       int flag = 0;

  for (int i=0, j=S.length()-1 ; i<S.length() && j>=0 ; i++, j--)
  {
    if( S.charAt(i) != S.charAt(j) )
    {
      cntr = 1;           
    }  
       if(S.charAt(j) != '0')
        { flag ++; } 
       if(S.charAt(j) == '0' && flag == 0) // if char equal 0 and before char equal 0 THEN continue
        { continue; }                      // else print

      System.out.print(S.charAt(j));
  } 
     System.out.println();
     
      if( cntr == 0 )
        System.out.println("YES");
      else 
        System.out.println("NO");       
 }   
}
