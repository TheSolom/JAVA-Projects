package cf_k.max.number;
import java.util.Scanner;
public class CF_KMaxNumber {
   
  static void Max_Number(int[] A , int n, int max)
  {
     if (n == -1)
      {
        System.out.println(max); 
        return;
      }  

      if(A[n] > max)
      {
        max = A[n];  
      }
  
      Max_Number(A , n-1 , max);
      
  }           
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] A = new int[n];
      
      for(int i=0 ; i<n ; i++) 
      {
        A[i] = sc.nextInt();
      }
      
      int max = A[n-1]; 
      
     Max_Number(A,n-1,max);
  }
    
}
