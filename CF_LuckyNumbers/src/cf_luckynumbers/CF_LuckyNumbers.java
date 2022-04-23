package cf_luckynumbers;
import java.util.Scanner;
public class CF_LuckyNumbers {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
     for(int i = a ; i<=b ; i++)
     {
         check(i);
         
     }
     
  }    
    
static void check(int n)
 {
  
      int r = n%10;
     if(r==4 || r==7)
     {  
         n/=10;
         System.out.println(n);
     }
     else
     {
         System.out.println("-1");
     }
        
   
}

}