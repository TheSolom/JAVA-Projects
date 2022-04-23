package cf_o.fibonacci;
import java.util.Scanner;
public class CF_OFibonacci {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        long[] A = new long[51];

        A[1] = 0;
        A[2] = 1;

      for(int i=3 ; i<=50 ; i++)
      {
        A[i] = A[i-1] + A[i-2];
      } 
      
      System.out.println(A[n]);
    
  }   
}
