package cf_l.maxsubarray;
import java.util.Scanner;
public class CF_LMaxSubarray {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);    
      int t = sc.nextInt();
      
 for (int x = 0; x<t; x++) 
 {   
     int n = sc.nextInt();
     int[] A = new int[n];
      
    for(int i=0 ; i<n ; i++) 
    {
     A[i] = sc.nextInt();
    }     
        
      for(int i=0 ; i<n ; i++) 
      {
        System.out.print(A[i]+ " ");
      }
             
        for(int i=0 ; i<n ; i++) 
        {      
               int maxi = A[i];           
           for(int j = i+1 ; j<n ; j++) 
            {
              maxi = Math.max( maxi , A[j] );
               System.out.print(maxi + " ");
            }
        }  
           System.out.println("");
  }      
 
 }  
}
