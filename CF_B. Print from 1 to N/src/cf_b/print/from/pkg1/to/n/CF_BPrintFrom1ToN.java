package cf_b.print.from.pkg1.to.n;
import java.util.Scanner;
public class CF_BPrintFrom1ToN {

   static void print_to_N(int n)
   {
       if(n==1)
        System.out.println("1");    
       else
       {  
          print_to_N(n-1);
          System.out.println(n);
       }   
   }   
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     
      print_to_N(n);
        
   }
    
}
