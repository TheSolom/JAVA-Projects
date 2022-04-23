package cf_k.combination.and.permutation;
import java.util.Scanner;
public class CF_KCombinationAndPermutation {

 static long factorial(int n) {
     
      long fact = 1;
      int i = 1;
      
      while(i <= n) 
      {
         fact *= i;
         i++;
      }
      
      return fact;
   }  
    
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();  
     int b = sc.nextInt();
     
     long NPR = factorial(a) / factorial(a-b);
    
     long NCR = factorial(a) / (factorial(b) * factorial(a-b));
      
        System.out.println(NCR + " " + NPR);
    
  } 

}
