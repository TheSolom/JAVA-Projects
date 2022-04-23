package cf_j.primesfrom1ton;
import java.util.Scanner;
public class CF_JPrimesFrom1TOn {
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);    
     int n = sc.nextInt();
      int cntr;
     
   for(int i=2 ; i <= n ; i++) 
   {
        cntr = 0;
        
       if( i <= 1 )
        cntr = 1;   
        
      for(int j=2 ; j <= i/2 ; j++) 
      {
        if( i%j == 0 )
         cntr = 1;
      }
      
     if(cntr == 0)
       System.out.print(i + " ");
   }
        
 }   
}
