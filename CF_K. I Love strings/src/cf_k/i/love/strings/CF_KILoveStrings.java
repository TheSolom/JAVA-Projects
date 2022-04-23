package cf_k.i.love.strings;
import java.util.Scanner;
public class CF_KILoveStrings {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
   int n = sc.nextInt();
  
    for(int i=0 ; i<n ; i++)
    {
        String S = sc.next();
        String T = sc.next();    
        
       for(int j=0 , k=0 ; j<S.length() || k<T.length() ; j++,k++)
       {
           if( S.length() > j )
             System.out.print(S.charAt(j));
           if( T.length() > k )
            System.out.print(T.charAt(j));      
       }
       
         System.out.println("");
    }
   
  }  
}
