package cf_n.max.subsequence;
import java.util.Scanner;
public class CF_NMaxSubsequence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt();
      String s = sc.next();
      char temp = 0;
      
      int cntr = 1;
      
      for(int i=0 ; i<n ; i++)
      {
         if( i==0 )
         {
           temp = s.charAt(i);
         }
         
          if( s.charAt(i) != temp )
          {
            cntr++;
             temp = s.charAt(i);
          }
      }
        System.out.println(cntr);
  }   
}
