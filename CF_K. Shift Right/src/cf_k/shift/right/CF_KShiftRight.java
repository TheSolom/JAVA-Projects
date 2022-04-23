package cf_k.shift.right;
import java.util.Scanner;
public class CF_KShiftRight {

 static void ShiftRight(int n, int x, int[] A){
     
   for(int j=1 ; j<=x ; j++)
   {
      int temp = A[n-1];
      
     for(int i=n-1 ; i>0 ; i--)
     {
       A[i] = A[i-1];
     }
       A[0]=temp;  
   }
   
     for(int i=0 ; i<n ; i++)
     {
       if(i != n-1)  
        System.out.print(A[i] + " "); 
       else
        System.out.println(A[i]);          
     }
 }      
    
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    int x = sc.nextInt();
   
     for(int i=0 ; i<n ; i++)
     {
       A[i] = sc.nextInt();
     }
   
     ShiftRight(n,x,A);
  }
    
}
