package cf_a.power.of.two;
import java.util.Scanner;
public class CF_APowerOfTwo {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);     
      Long n = sc.nextLong();
      boolean name;
      
      
       name = ( n & (n-1) ) == 0;  //With Binary
     
      if(name)
        System.out.println("YES");
      else
        System.out.println("NO");   
      
//    or
//              
//       while(n%2 ==0)
//       {
//          n/= 2;
//       }   
//          if(n==1)
//           System.out.println("YES");
//          else
//           System.out.println("NO");     
//            
//    or    
//
//    
//    double res = ( Math.log(n) / Math.log(2) ) ;
//
//    if( res - (long)res != 0)      // error at test 32 
//     System.out.println("NO");
//    else
//     System.out.println("YES");    
    
          
  }
    
}
