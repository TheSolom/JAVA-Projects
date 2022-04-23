package cf_m.suffix.sum;
import java.util.Scanner;
public class CF_MSuffixSum {

   static long Suffix_Sum(int[] A, int n, int m)
   {
      if(m == 1)
       return A[n];  

      return A[n] + Suffix_Sum(A,n-1,m-1);
   }  
       
   
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int[] A = new int[n];
     
     for(int i=0 ; i<n ; i++)
     {
        A[i] = sc.nextInt();
     }
   
      System.out.println(Suffix_Sum(A,n-1,m));   
  }
    
}
