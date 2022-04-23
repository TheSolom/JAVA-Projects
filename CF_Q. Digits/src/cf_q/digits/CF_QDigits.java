package cf_q.digits;
import java.util.Scanner;
public class CF_QDigits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        
      for(int i=0 ; i<N ; i++) 
      {
          int n = sc.nextInt();
          String number = String.valueOf(n);

         for(int j = 0 ; j<number.length() ; j++)
           { 
            System.out.print( n%10 + " ");
                 n/=10;      
           }
          System.out.println("");
      }
  }
}
