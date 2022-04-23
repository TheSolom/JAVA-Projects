package cf_hardcompare;
import java.math.BigInteger;
import java.util.Scanner;
public class CF_HardCompare {

    public static void main(String[] args) {
        
      Scanner s = new Scanner (System.in);
        String A,B,C,D;
         A = s.next();
         B = s.next();
         C = s.next();
         D = s.next();
        
         BigInteger value1 = new BigInteger(A);
         Integer exp1 = Integer.parseInt(B);
         BigInteger E = value1.pow(exp1);
         
         BigInteger value2 = new BigInteger(C);
         Integer exp2 = Integer.parseInt(D);
         BigInteger F = value2.pow(exp2);

// or:  int E = Math.pow(A,B);
// or:  int F = Math.pow(C,D);
// or;  b*log(a) & d*log(C)      
        if( E.compareTo(F) > 0  )
            System.out.println("YES");
        else if (E.compareTo(F) < 1 )
              System.out.println("NO");
        
        
        
        
    }  
}
