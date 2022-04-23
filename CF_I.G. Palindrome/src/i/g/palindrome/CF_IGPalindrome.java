package i.g.palindrome;
import java.util.Scanner;
public class CF_IGPalindrome {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);    
       int n = sc.nextInt();
        int[] A = new int[n];
         int cntr = 0;
         
    for (int i=0 ; i < n ; i++) 
    {
      A[i] = sc.nextInt();
    }     
     
        for (int i=0, j=n-1 ; i<n && j>=0 ; i++, j--)
        {
           if(A[i] != A[j])
           {
             cntr = 1;
             break;
           }       
        }
        
        if(cntr == 0)
         System.out.println("YES");
        else System.out.println("NO");
  }  
}
