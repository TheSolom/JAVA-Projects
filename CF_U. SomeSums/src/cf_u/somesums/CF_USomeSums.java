package cf_u.somesums;
import java.util.Scanner;
public class CF_USomeSums {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        
     for (int i = 1; i<=n ; i++) 
     {     
          int result = 0;
           int m = i;
         
         while(m!=0)
         {      //Separate digits
           result = result + (m % 10);
           m = m / 10;
         }
            //Total Sum
        if(result >= a && result <= b)
             sum = sum + i;        
     }    
        System.out.println(sum);
  } 
}
