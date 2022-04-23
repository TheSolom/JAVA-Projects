package cf_g.pyramid;
import java.util.Scanner;
public class CF_GPyramid {

   static void Pyramid(int n, int num) //num = n
   {
      if(n == 0)
       return;  
      
      Pyramid(n-1, num);
      space(num - n);  //num - n , num - n-1 , num - n-2 and so on......
      asterisk(n*2-1);  // 1 3 5 6 and so on....
   
       System.out.println();        
   }
   
   static void space(int n)
   {
      if(n == 0)
       return;   
       
      System.out.print(" ");
       space(n-1);     
   } 
    
   static void asterisk(int n)
   {
      if(n == 0)
       return;   
             
      System.out.print("*");
       asterisk(n-1);        
   }  
    
   
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      Pyramid(n,n);            
  }  
      
}

