package cf_e.maximum.distinct.numbers;
import java.util.Scanner;
public class CF_EMaximumDistinctNumbers {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);     
      Long n = sc.nextLong();  

  System.out.println((long)(Math.sqrt(1+8*n)-1)/2 );  
  
//    for(long i=1 ;   ; i++)
//    {
//       if(i>n)             //timelimit at 4
//       {  
//         System.out.println(i-1);
//          return;
//       }
//        else
//	   n = n - i;
//    }
         //15,1  14,2  12,3  9,4  5,5  0,6  n,i   print 5
  }  
}
