package cf_p.minimizenumber;
import java.util.Scanner;
public class CF_PMinimizeNumber {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
     int n = sc.nextInt();
       int[] A = new int[n];
       
  for(int i=0 ; i<n ; i++) 
  {
    A[i] = sc.nextInt();
  }
         int mini = Integer.MAX_VALUE;
          
    for(int i=0 ; i<n ; i++)  // outer loop
    {
         int cntr = 0;
         
      if(A[i] % 2 !=0)   //check even
      {
       System.out.println("0"); return;
      }
        
       else 
        while(A[i] %2 == 0) //inner loop for division and counter
        {
          A[i] /= 2;  
           cntr++;
        }
       
          mini = Math.min(mini, cntr); // take each counter and check the smallest 
    }    
    
       System.out.println(mini);
 }  
}
