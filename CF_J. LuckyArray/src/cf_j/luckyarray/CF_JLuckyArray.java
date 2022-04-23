package cf_j.luckyarray;
import java.util.Scanner;
public class CF_JLuckyArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
       int n = sc.nextInt();
        int[] A = new int[n];
          int frequency = 0;  //
          
    for (int i=0 ; i < n ; i++) 
    {
      A[i] = sc.nextInt();
    }   
            int cntr = A[0];  //
          
        for (int i = 0; i < n; i++) 
        {
           if(A[i] < cntr)
           { 
            cntr = A[i];
           }                    
        }
                    
            for (int j = 0 ; j < n ; j++) 
            {
              if(A[j] == cntr)
                frequency++;
            }   
              
            
            if(frequency%2==0)
                System.out.println("Unlucky");
            else
                System.out.println("Lucky");
  }  
}
