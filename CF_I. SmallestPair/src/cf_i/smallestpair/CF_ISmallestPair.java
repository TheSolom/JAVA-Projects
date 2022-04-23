package cf_i.smallestpair;
import java.util.Scanner;
public class CF_ISmallestPair {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
       int t = sc.nextInt();
       
  for (int x = 0 ; x < t ; x++) 
  {
     int n = sc.nextInt();
      int[] A = new int[n+1];
      
     for (int i=1 ; i <= n ; i++) 
     {
       A[i] = sc.nextInt();
     }      
/////////////////////////////////////////////////////////////////   

           int mini = Integer.MAX_VALUE;
           
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = i+1 ; j <= n ; j++) 
            { 
              mini = Math.min( mini , (A[i]+A[j]+j-i) );
            }           
        }
            System.out.println(mini);   
  }  
  
 }  
}
