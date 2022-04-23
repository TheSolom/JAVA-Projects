package cf_g.max.and.min;
import java.util.Scanner;
public class CF_GMaxAndMIN {

 static void MinMax( int n, int [] A){  
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     
   for(int i=0 ; i<n ; i++)
   {
     min = Integer.min(min, A[i]);
     max = Integer.max(max, A[i]);
   }
   
   System.out.println(min + " " + max);        
 }   
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt();
      
       int [] A = new int[n];
      for(int i = 0 ; i<n ; i++)
      {
        A[i] = sc.nextInt();  
      }
  
        MinMax(n,A);  
    }
  
}
