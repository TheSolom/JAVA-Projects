package cf_n.convert.to.base;
import java.util.Scanner;
public class CF_NConvertToBase {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);     
      int t = sc.nextInt();   
      
     if(t == 1)
     { 
        String s = sc.next();
        int x = sc.nextInt();  
       System.out.println(Long.parseLong(s,x)); //base x to decimal
     }
     else 
      if(t == 2)
      {
         int n = sc.nextInt();     
         int x = sc.nextInt();    
        System.out.println(Integer.toString(n,x).toUpperCase()); //decimal to base x
      }
      
     
  }
    
}
