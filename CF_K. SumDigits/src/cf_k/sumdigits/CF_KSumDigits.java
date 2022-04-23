package cf_k.sumdigits;
import java.util.Scanner;
public class CF_KSumDigits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
       int n = sc.nextInt();
       String s = sc.next();

          int sum = 0;
        
      for(int i=0 ; i < n ; i++) 
       {  
          sum = sum + Character.getNumericValue(s.charAt(i));
       }
             System.out.println(sum);
  }  
}
