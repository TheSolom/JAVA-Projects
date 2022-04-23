package cf_e.base.converssion;
import java.util.Scanner;
public class CF_EBaseConverssion {

   static void BaseConverssion(long n)
   {
       if(n==0)
        return;
       else
       {  
          BaseConverssion(n/2);
           System.out.print(n%2);
       }   
   }
   
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      
     for(int i=0 ; i<T ; i++) 
     {
       long n = sc.nextLong();
       
        if(n==0)
         System.out.println("0");   
        else
        {
           BaseConverssion(n); 
           System.out.println();   
        }
     }
  
  }  
  
}
    
