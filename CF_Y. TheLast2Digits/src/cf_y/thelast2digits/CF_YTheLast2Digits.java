package cf_y.thelast2digits;
import java.util.Scanner;
public class CF_YTheLast2Digits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      
    A%=100; B%=100; C%=100; D%=100;
      
      int N = A*B*C*D;  
      int M = N%100;
      
     if(M<10)
        System.out.println("0" + M);
     else System.out.println(M);
  } 
}
