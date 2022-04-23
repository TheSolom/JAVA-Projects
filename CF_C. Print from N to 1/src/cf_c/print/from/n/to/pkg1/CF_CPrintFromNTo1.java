package cf_c.print.from.n.to.pkg1;
import java.util.Scanner;
public class CF_CPrintFromNTo1 {

   static void print_from_N(int n)
   {
       if(n==1)
        System.out.print("1");    
       else
       {  
          System.out.print(n + " ");
          print_from_N(n-1);         
       }   
   }
   
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
   
      print_from_N(n);     
   }  
}
