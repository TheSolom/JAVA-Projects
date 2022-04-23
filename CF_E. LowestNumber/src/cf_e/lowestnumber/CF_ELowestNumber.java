package cf_e.lowestnumber;
import java.util.Scanner;
public class CF_ELowestNumber {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);    
       int n = sc.nextInt();
        int[] A = new int[n+1];
         
    for (int i=1 ; i <= n ; i++) 
    {
      A[i] = sc.nextInt();
    }   

         int cntr = A[1] , pos = 1;  // 1 not i
         
        for (int i=1 ; i <= n ; i++) 
        {
            if(A[i] < cntr)
            { 
               cntr = A[i];  
               pos = i;
            }        
        }
     
        System.out.println(cntr + " " + pos);     
  } 
}
