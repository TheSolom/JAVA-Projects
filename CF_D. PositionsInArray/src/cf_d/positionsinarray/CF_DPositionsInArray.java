package cf_d.positionsinarray;
import java.util.Scanner;
public class CF_DPositionsInArray {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        int[] A = new int[n];
        
    for (int i = 0; i < n; i++) 
    {
      A[i] = sc.nextInt();
    }   
        
       for (int i = 0; i < n; i++) 
      {
        if(A[i] <= 10) 
          System.out.printf( "%s%d%s %s %d\n" , "A[", i, "]", "=", A[i] );    
      }  
        
        
  } 
}
