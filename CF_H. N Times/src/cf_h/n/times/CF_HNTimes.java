package cf_h.n.times;
import java.util.Scanner;
public class CF_HNTimes {
   
  static void repeatNtimes(int n, char c){  
    
     for(int i=1 ; i<=n ; i++)
     {        
         if(i != n) 
          System.out.print(c + " ");
         else
          System.out.println(c);
     }         
  }
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);   
    int t = sc.nextInt();
    
    for(int i=1 ; i<=t ; i++)
    {
      int n = sc.nextInt();
      char c = sc.next().charAt(0);
       repeatNtimes(n,c);
    }    
    
  }
    
}
