package cf_q.pkg3n.pkg1.sequence;
import java.util.Scanner;
public class CF_Q3n1Sequence {
    
  static void sequence(int n, int result)
  {
      if (n <= 1)
      {
        System.out.print(++result);  
         return; 
      }
  
      if (n%2 == 0) 
      {
        sequence(n/2, ++result);
      }
      
      if (n%2 != 0) 
      {
        sequence(3*n+1, ++result); 
      }    
  }           
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int result = 0;
     
      sequence(n,result);   
  }
    
}
