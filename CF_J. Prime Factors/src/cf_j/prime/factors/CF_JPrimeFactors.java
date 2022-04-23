package cf_j.prime.factors;
import java.util.Arrays;
import java.util.Scanner;
public class CF_JPrimeFactors {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] A = new int[1000001];
     int cntr = 0;
     
     for(int i=2 ; i*i < n ; i++) 
     {
       while(n%i ==0)
       {
          A[cntr++] = i;
          n/= i;         
       }    
     }
        if(n>2)
        A[cntr++] = n;
 
        System.out.println(cntr);
        
        
   boolean visited[] = new boolean[1000001];
        
     for (int i = 0; i<cntr ; i++) 
     {
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1 ; j<cntr ; j++)
        {
          if (A[i] == A[j]) 
          {
            visited[j] = true;
             count++;
          }
        }
         System.out.print(i);
        
         if(i == cntr-1)
          System.out.print("("+ A[i] +"^"+ count +")"); 
         else
          System.out.print("("+ A[i] +"^"+ count +")*");              
     }
     
     
  }   
}
