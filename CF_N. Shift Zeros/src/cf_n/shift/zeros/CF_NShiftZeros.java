package cf_n.shift.zeros;
import java.util.Scanner;
public class CF_NShiftZeros {

  static void ShiftZeros(int n , int[] A){
  
    for(int j=0; j<n ; j++)    
    { 
      for(int i=n-1; i>0 ; i--)
      {
        if(A[i-1] == 0)
        {
          int temp = A[i];
           A[i] = A[i-1];
           A[i-1] = temp;
        }       
      }
    }
    
      for(int i=0 ; i<n ; i++)
       System.out.print(A[i] + " ");  
 }  
    
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();
    int[] A = new int[n];
      for(int i=0 ; i<n ; i++)
      {
        A[i] = sc.nextInt();
      }
      
      ShiftZeros(n,A);
  }
    
}
