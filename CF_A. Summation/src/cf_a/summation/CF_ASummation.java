package cf_a.summation;
import java.util.Scanner;
public class CF_ASummation {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
      int n = sc.nextInt();
      long sum = 0;
        long[] A = new long[n];
        
      for (int i = 0; i < n; i++) 
      {
          A[i] = sc.nextInt();
         sum = sum + A[i];
      }  
         System.out.println( Math.abs(sum) );
        
  }  
}
