package cf_f.print.even.indices;
import java.util.Scanner;
public class CF_FPrintEvenIndices {

   static void BaseConverssion(int n, int[] A)
   {
       if(n<0)
       {
         return;
       } 
  
       if(n%2 == 0)
       {
         System.out.print(A[n] + " ");
       }
       
        BaseConverssion(n-1,A);             
   }
   
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] A = new int[n];
      
     for(int i=0 ; i<n ; i++) 
     {
       A[i] = sc.nextInt();
     } 

       BaseConverssion(n-1,A);         
     
  }  

}
