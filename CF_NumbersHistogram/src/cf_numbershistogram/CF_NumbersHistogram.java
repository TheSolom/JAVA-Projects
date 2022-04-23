package cf_numbershistogram;
import java.util.Scanner;
public class CF_NumbersHistogram {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = sc.nextInt();
      int[] n = new int[N];
      
     for(int i=0 ; i<N ; i++)
         
     { n[i] = sc.nextInt(); }        
        
       for(int i=0 ; i<N ; i++)
       {
           
         for(int k=0 ; k < n[i] ; k++)
          {
             System.out.print(S);   
          }
         
            System.out.println();     
       }   
 
  }   
}
