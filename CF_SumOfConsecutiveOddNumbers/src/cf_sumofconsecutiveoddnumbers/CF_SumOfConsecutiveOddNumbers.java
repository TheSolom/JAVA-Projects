package cf_sumofconsecutiveoddnumbers;
import java.util.Scanner;
public class CF_SumOfConsecutiveOddNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int N,M;
       
   for (int i=1 ; i<=A ; i++) 
    {
         N = sc.nextInt();
         M = sc.nextInt();
         int sum = 0;
         
       if(N>M){
        int temp = M;
         M = N;
         N = temp;
        }  
        
       for(int k = N+1; k < M ; k++)
       {    
         if(k % 2 !=0)
           sum = sum + k;
       } 
        System.out.println(sum);
    } 

  }  
}
