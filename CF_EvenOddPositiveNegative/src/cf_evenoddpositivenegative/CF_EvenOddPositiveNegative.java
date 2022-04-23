package cf_evenoddpositivenegative;
import java.util.Scanner;
public class CF_EvenOddPositiveNegative {

   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int x = 0 ;
       int Even = 0;
       int Odd = 0; 
       int Positive  = 0;
       int Negative = 0;
       
      for(int i = 0 ; i<n ; i++)
       { x = sc.nextInt(); 
       
        if( x % 2 == 0 )
        Even++ ;
        
        if( x % 2 != 0 )
        Odd++ ;
        
        if( x>0 )
        Positive++ ;
        
        if( x<0 )
        Negative++ ;
            
      } 
        
       System.out.println("Even: " + Even +"\n"+ "Odd: " + Odd +"\n"+ "positive: " + Positive +"\n"+ "Negative: " + Negative );
      
   } 
}
