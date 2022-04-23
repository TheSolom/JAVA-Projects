package cf_sequenceofnumbersandsum;
import java.util.Scanner;
public class CF_SequenceOFNumbersAndSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N,M;
    
    do
    {
        N = sc.nextInt();  
        M = sc.nextInt();
        int sum = 0;
        
       if(N>M){
        int temp = M;
         M = N;
         N = temp;
        }  
        
      if(N>0 && M>0) 
      {
        for(int i=N ; i<=M ; )
         {       
           System.out.print(N++ + " ");   
             sum = sum + i;
                 i++; 
         }
            
        System.out.print("sum =" + sum);
         System.out.println("");   
      }  
      
    } while(N > 0 && M>0);
     
  }  
}
