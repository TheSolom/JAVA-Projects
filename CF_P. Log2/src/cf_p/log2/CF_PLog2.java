package cf_p.log2;
import java.util.Scanner;
public class CF_PLog2 {
    
   static void log2(double n, int result)
   {      
     if (n < 2)
     {
        System.out.print(result);
        return;
     } 
  
       log2( n/2 , ++result);
   } 
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
      double n = sc.nextDouble();
      int result = 0;
      
      log2(n,result);   
  }
    
}
