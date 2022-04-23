package cf_m.replaceminmax;
import java.util.Scanner;
public class CF_MReplaceMinMax {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
      int n = sc.nextInt();
       int[] A = new int[n];
         int posmin = 0;
         int posmax = 0;
          
   for(int i=0 ; i < n ; i++) 
   {
     A[i] = sc.nextInt();
   }   
 
        int small = A[0];
      for(int i = 0 ; i<n ; i++) 
      {
          if(A[i] < small)
           small = A[i];  
          if(A[i] == small)
            posmin = i;
      }
      
            int big = A[n-1];
        for(int j = 0 ; j<n ; j++) 
        {
          if(A[j] > big)
           big = A[j]; 
          if(A[j] == big)
            posmax = j;
        }
        
           int temp = A[posmax];
            A[posmax] = A[posmin];
             A[posmin] = temp;
      
             
        for(int i = 0 ; i<n ; i++) 
         System.out.print(A[i] + " ");                  
  }  
}
