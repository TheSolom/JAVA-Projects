package javastringreversepalindrome;
import java.util.Scanner;
public class JavaStringReversePalindrome {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String A = sc.next();  
        int i = 0 ;
        int j = A.length()-1;
        
        
    for(    ;   i <= j  ;  i++,j-- ) 
    {
        if (A.charAt(i) !=  A.charAt(j)) 
        {  
           System.out.println("No"); 
            System.out.println(A);
                 return;
        }
    }                       
            System.out.println(A);
           System.out.println("Yes");              
  }
}
        /* String S = new StringBuilder(A).reverse().toString();
        System.out.print( A.equals(S) ? "Yes" : "No" ); */
      