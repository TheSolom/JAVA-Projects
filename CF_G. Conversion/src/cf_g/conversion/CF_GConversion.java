package cf_g.conversion;
import java.util.Scanner;
public class CF_GConversion {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);    
    String S = sc.nextLine();
     
  for (int i=0 ; i < S.length() ; i++) 
  {
    if( S.charAt(i) == ',' )      
    {
      System.out.print(" ");  
    }  
    
    else if( S.charAt(i) >= 97 && S.charAt(i) <= 122 )
         {
           int as = S.charAt(i) - 32;
           char ch = (char) as;  
             System.out.print(ch);
         }
   
    else if( S.charAt(i) >= 65 && S.charAt(i) <= 90 ) 
         {
          int as = S.charAt(i) + 32;
           char ch = (char) as;  
             System.out.print(ch);
         }  
    else
          System.out.println(S.charAt(i));      
  }
     
 }  
}

