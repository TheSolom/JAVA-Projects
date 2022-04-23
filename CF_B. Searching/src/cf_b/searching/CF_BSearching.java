package cf_b.searching;
import java.util.Scanner;
public class CF_BSearching {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        int[] A = new int[n];
        
    for (int i = 0; i < n; i++) 
    {
      A[i] = sc.nextInt();
    }  
    
         int x = sc.nextInt(); 
          int cntr = 0;
        
      for (int i = 0; i < n; i++) 
      {
         if(A[i] == x)
         { System.out.println(i); cntr++; return; }      
      }
       if(cntr ==0)
          System.out.println("-1");
  } 
}
