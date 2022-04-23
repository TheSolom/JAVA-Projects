package cf_o.big.add.and.multiply;
import java.math.BigInteger;
import java.util.Scanner;
public class Cf_OBigAddAndMultiply {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     BigInteger n = sc.nextBigInteger();
     BigInteger x = BigInteger.valueOf(9999);
     
     System.out.println(n.add(x));
     System.out.print(n.multiply(x));
      
  }
    
}
