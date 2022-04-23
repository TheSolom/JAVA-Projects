package cf_f.way.too.pkglong.words;
import java.util.Scanner;
public class CF_FWayTooLongWords {
    
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();
    
  for(int i=0 ; i<n ; i++) 
  {    
    String S = sc.next(); 

     if( S.length()<=10 )
         System.out.println(S);   
     else 
      {
         System.out.print( S.charAt(0) );
         System.out.print( S.length()-2 );
         System.out.print( S.charAt(S.length()-1) );
         System.out.println("");
      }   
  }

 }   
}
