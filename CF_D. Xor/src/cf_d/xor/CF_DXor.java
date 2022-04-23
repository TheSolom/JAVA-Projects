package cf_d.xor;
import java.util.Scanner;
public class CF_DXor {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);     
      Long a = sc.nextLong();  
      Long b = sc.nextLong();     
      Long q = sc.nextLong();

      if( q%3 == 1 )
      {
        System.out.println(a);
      }
   
      else if( q%3 == 2 )
      {
        System.out.println(b);
      }
      
      else
      {
        System.out.println( (a ^ b) );
      }
      
  }
    
}
