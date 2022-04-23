package cf_c.replacement;
import java.util.Scanner;
public class CF_CReplacement {

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
        if(A[i] > 0) 
          System.out.print("1 ");   
        if(A[i] < 0)
          System.out.print("2 ");
        if(A[i] == 0)
          System.out.print("0 ");
      }
  
      
  } 
}
