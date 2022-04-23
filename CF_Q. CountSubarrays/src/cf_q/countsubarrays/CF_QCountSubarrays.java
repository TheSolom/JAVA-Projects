package cf_q.countsubarrays;
import java.util.Scanner;
public class CF_QCountSubarrays {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);         
  int x = sc.nextInt();
for (int t = 0; t < x; t++) 
{     
     int n = sc.nextInt();
      int[] A = new int[n];
  for (int i = 0; i < n; i++) 
  {
    A[i] = sc.nextInt();  
  }    
        int cntr = 0;
        
    for (int i=0 ; i<n ; i++) 
    {
         cntr++; 
      for (int j=i+1 ; j<n ; j++) 
      {
        if(A[j] >= A[j-1])
         { cntr++; }
        else
         { break; }    
      }
    }
       System.out.println(cntr); 
 } 

 } 
}
