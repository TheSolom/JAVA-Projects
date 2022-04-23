package cf_r.permutationwitharrays;
import java.util.Arrays;
import java.util.Scanner;
public class CF_RPermutationWithArrays {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);   
      
   int n = sc.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];
    
  for(int i=0 ; i<n ; i++) 
  {
    A[i] = sc.nextInt();  
  }     
   for(int j=0 ; j<n ; j++) 
  {
    B[j] = sc.nextInt();  
  }     
    Arrays.sort(A);
    Arrays.sort(B);
    
      int cntr = 0;
      
     for(int i=0 ; i<n ; i++) 
     {
       if(A[i] == B[i])
        cntr++ ;    
     }
       if(cntr == n) 
        System.out.println("yes");
       else
        System.out.println("no");
 } 
}
