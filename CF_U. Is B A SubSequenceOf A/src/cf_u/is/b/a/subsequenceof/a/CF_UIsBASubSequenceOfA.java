package cf_u.is.b.a.subsequenceof.a;
import java.util.Scanner;
public class CF_UIsBASubSequenceOfA {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
     int n = sc.nextInt();
     int m = sc.nextInt();
      long[] A = new long[n];
      long[] B = new long[m];
      
  for(int i = 0 ; i<n ; i++) 
  {
    A[i] = sc.nextInt();  
  }        
  for(int i=0 ; i<m ; i++) 
  {
    B[i] = sc.nextInt();  
  }            
  
       int cntr = 0;
  
    for (int i=0 ; i<n ; i++) 
    {
      for (int j=0 ; j<m ; j++) 
      {
        if(B[j] == A[i])
         cntr++;
      }
    } 
    
        for (int i=m-1 ; i>0 ; i--) 
        {
          if(B[i] == B[i-1]) 
            cntr--;
        }
        
        if(cntr == m)
         System.out.println("YES");
        else
         System.out.println("NO");   
   }   
}
