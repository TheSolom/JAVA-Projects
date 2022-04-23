package cf_p.shape1;
import java.util.Scanner;
public class CF_PShape1 {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();
    
   for(int i=0 ; i<n ; i++) 
   { 
     for(int j=0 ; j<=i ; j++)   // j < n-i for reversed shape
     {
         System.out.print("*");  
     }
       System.out.println("");
   }
  
 } 
}
