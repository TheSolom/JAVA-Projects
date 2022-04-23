package cf_s.array.average;
import java.util.Scanner;
public class CF_SArrayAverage {

   static double Average(int[] A, int n , int i)
   {    
       if(i == n-1) 
        return (A[i] + Average(A,n,i-1)) / n; 
       
       if(i == 0)
        return A[i];
  
      return A[i] + Average(A,n,i-1);
   }  
    
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] A = new int[n];
    
      for(int i=0 ; i<n ; i++) 
      {
         A[i] = sc.nextInt(); 
      } 
        
       System.out.printf("%.6f",Average(A,n,n-1));
   }
    
}
