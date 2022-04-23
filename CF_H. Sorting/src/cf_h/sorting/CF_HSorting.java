package cf_h.sorting;
import java.util.Scanner;
public class CF_HSorting {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
       int n = sc.nextInt();
        int[] A = new int[n];
         
    for (int i=0 ; i < n ; i++) 
    {
     A[i] = sc.nextInt();
    }     
        
       for (int i = 0; i < n ; i++) 
       {
          for (int j = 0; j < n-1 ; j++) 
          {
             if(A[j] > A[j+1])   //Ascending
              {    
                int temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
              }           
          }
       }
        
          for (int i = 0; i < n; i++) 
         { System.out.print( A[i] + " "); }
  }  
}
