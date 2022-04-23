package cf_m.subsequence.string;
import java.util.Scanner;
public class CF_MSubsequenceString {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
     
     String s = sc.next();
     String value = "hello";
     int j=0;
     
    for (int i=0 ; i<s.length() && j<value.length() ; i++)
    {
      if( s.charAt(i) == value.charAt(j) )
         j++;    
    }
    
       if( j == value.length() ) 
            System.out.println("YES");
        else
            System.out.println("NO");   
  }   
}
