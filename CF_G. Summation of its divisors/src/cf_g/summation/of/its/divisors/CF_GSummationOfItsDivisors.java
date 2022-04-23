package cf_g.summation.of.its.divisors;
import java.util.Scanner;
public class CF_GSummationOfItsDivisors {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);     
      Long n = sc.nextLong();      
      Long sum = 0L;
      
      for(Long i=1L ; i*i <= n ; i++)  // or sqrt(n)
      {
        if (n%i == 0)
        {
          if(n/i == i)
           sum += i;
          else
           sum += i + n/i;
        }  
      }
      
      System.out.println(sum);     
 }
    
}
