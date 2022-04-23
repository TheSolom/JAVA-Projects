package cf_l.summation;
import java.util.Scanner;
public class CF_LSummation {
    
  static long Summation(long[] A, int n)
  {
     if(n == 0)
     {
       return A[n]; 
     }
     
     return A[n] + Summation(A,n-1);
  }          
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     long[] A = new long[n];

     for(int i=0 ; i<n ; i++)
     {
        A[i] = sc.nextLong();
     }

     System.out.println(Summation(A,n-1));  
  }
    
}
