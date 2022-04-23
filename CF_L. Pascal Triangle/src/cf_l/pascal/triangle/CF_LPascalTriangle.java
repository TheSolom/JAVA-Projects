package cf_l.pascal.triangle;
import java.util.Scanner;
public class CF_LPascalTriangle {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
     
       for (int i=1 ; i<=n ; i++)
       {
         int num = 1;  
         
           for (int j=1 ; j<=i ; j++)
           {
               System.out.print(num + " ");
               num = num * (i-j)/(j); 
           }
           System.out.println("");
       }
        
        
  }
    
}
