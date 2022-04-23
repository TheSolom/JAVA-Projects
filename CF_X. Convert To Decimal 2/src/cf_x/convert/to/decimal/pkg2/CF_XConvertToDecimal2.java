package cf_x.convert.to.decimal.pkg2;
import java.util.Scanner;
public class CF_XConvertToDecimal2 {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int A = sc.nextInt();
      
    for(int i=0 ; i<A ; i++) 
    {
        int cntr = 0;  
        int digit = 0;
        int binary = 0;
        int num = 0;
        
      int n = sc.nextInt();
       
      while(n!=0)
      { 
         digit = n % 2;  
           n /= 2;
           
        if(digit == 1)
          cntr ++;    
      }
      
        for(int j = 0 ; j<cntr ; j++)
        {
           binary = (int) Math.pow(2,j);
            num = num + binary;
        }
  
       System.out.println(num);     
    }
   
  } 
}
