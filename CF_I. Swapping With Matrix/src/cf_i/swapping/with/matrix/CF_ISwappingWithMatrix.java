package cf_i.swapping.with.matrix;
import java.util.Scanner;
public class CF_ISwappingWithMatrix {
    
  static void Swap(int n, int x, int y ,int[][] A){
  
     for(int i=0 ; i<n ; i++)
     {
       int temp = A[x-1][i];
        A[x-1][i] = A[y-1][i];
        A[y-1][i] = temp;
     }
     
      for(int j=0 ; j<n ; j++)
      {
         int temp = A[j][x-1];
         A[j][x-1] = A[j][y-1];
         A[j][y-1] = temp;
      }
     
       for(int i=0; i<n ; i++)
       {
         for(int j=0 ; j<n ; j++)
         { 
           if(j != n-1)
            System.out.print(A[i][j] + " "); 
           else
            System.out.print(A[i][j]);   
         }
         System.out.println("");
       }     
  }
            
   
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      int[][] A = new int[n][n];
      
      for(int i=0 ; i<n ; i++) 
      {
        for(int j=0 ; j<n ; j++)
        {
           A[i][j] = sc.nextInt();
        }  
      }
       
       Swap(n,x,y,A);     
  }
    
}
