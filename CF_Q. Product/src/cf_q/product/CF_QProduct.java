package cf_q.product;
import java.util.Scanner;
public class CF_QProduct {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int L = sc.nextInt();   
     int R = sc.nextInt();   
     int M = sc.nextInt();   
     long res = 1;     
               
    for(int i=L ; i<=R ; i++)
    {
      res *= i;
      res %= M; 
    }
      
      System.out.println(res); 
           
  }
    
}
