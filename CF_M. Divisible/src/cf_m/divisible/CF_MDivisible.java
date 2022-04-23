package cf_m.divisible;
import java.math.BigInteger;
import java.util.Scanner;
public class CF_MDivisible {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     BigInteger n = sc.nextBigInteger();  
     BigInteger x = sc.nextBigInteger();   
     
      if(n.mod(x).equals(BigInteger.ZERO))
       System.out.println("YES");
      else  
       System.out.println("NO");  
      
  }
    
}
