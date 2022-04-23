package cf_t.matrix;
import java.util.Scanner;
public class CF_TMatrix {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
      int n = sc.nextInt();
   
    int[][] arr = new int[n][n];    
        
 for(int i=0 ; i<n ; i++) 
 {
  for(int j=0 ; j<n ; j++)
  {   
    arr[i][j] = sc.nextInt();
  } 
 } 
      int sum1 = 0, sum2 = 0;
        
    for (int i=n-1, j=0 ; i>=0 && j<n ; i--, j++) 
    {      
      sum1 = sum1 + arr[i][j];  // increasing +ve diagonal
    }
    
      for (int i=0, j=0 ; i<n && j<n ; i++, j++) 
      {
        sum2 = sum2 + arr[i][j];  // decreasing -ve diagonal
      }
 
         int sum = Math.abs(sum1-sum2);  // Not : Math.abs(sum1) + Math.abs(sum2);
           System.out.println(sum);
 }   
}
