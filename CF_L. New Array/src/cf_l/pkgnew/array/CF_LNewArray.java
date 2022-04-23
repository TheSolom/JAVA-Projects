package cf_l.pkgnew.array;
import java.util.Scanner;
public class CF_LNewArray {

 static void ConcatArrays(int n, int[] A, int[] B, int[] C){
 
    int i;     
     for( i=0 ; i<n ; i++) 
     {
       C[i] += B[i];
     }
      for (int element : A) 
      {
        C[i] = element;
         i++;
      }
     
      for(int j=0 ; j<n+n ; j++)
      {
        if(j != n+n-1)  
         System.out.print(C[j] + " "); 
        else
         System.out.println(C[j]);          
      }  
 }
    
    
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];
    int[] C = new int[n+n];
 
     for(int i=0 ; i<n ; i++)
     {
       A[i] = sc.nextInt();
     }
      for(int i=0 ; i<n ; i++)
     {
       B[i] = sc.nextInt();
     }

     ConcatArrays(n,A,B,C);
  }
    

}