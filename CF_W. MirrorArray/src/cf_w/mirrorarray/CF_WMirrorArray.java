package cf_w.mirrorarray;
import java.util.Scanner;
public class CF_WMirrorArray {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
     int n = sc.nextInt();
     int m = sc.nextInt();
      int[][] A = new int[n][m];
      
  for(int i=0 ; i<n ; i++) 
  {
   for (int j=0; j<m ; j++) 
   {
     A[i][j] = sc.nextInt(); 
   }
  }     
      for(int i=0 ; i<n ; i++)
       {
         int temp = 0 , start = 0, end=0;
  
          while(start < end)
          { 
            temp = A[i][start];
            A[i][start] = A[i][end];
            A[i][end] = temp;  
          }        
       }
     
      for(int i = 0; i < n ; i++) 
      {
        for (int j = m-1; j>=0; j--)
        {
           System.out.print(A[i][j] + " ");
        }
          System.out.println("");
      }   
 }  
}
