package cf_r.palindrome.array;
import java.util.Scanner;
public class CF_RPalindromeArray {

   static boolean Palindrome(int[] A, int start, int end)
   {
      if(start >= end)
       return true;
      
       if(A[start] == A[end])
       {
         return Palindrome(A, start+1, end-1);
       }
       
       else
       return false;
   }  
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] A = new int[n];
    
      for(int i=0 ; i<n ; i++) 
      {
         A[i] = sc.nextInt(); 
      }
      
      if( Palindrome(A,0,n-1) )
        System.out.print("YES");
      else
        System.out.println("NO");
  }
    
}

