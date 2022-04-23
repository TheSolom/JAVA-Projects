package cf_s.max.split;
import java.util.Scanner;
public class CF_SMaxSplit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
     String s = sc.next();
     int cntr = 0;
     int Lc = 0;
     int Rc = 0;
     
     for(int i=0 ; i<s.length() ; i++)
     {
       if(s.charAt(i) == 'L')
       { 
          Lc++; 
         System.out.print(s.charAt(i));
       }
       
       if(s.charAt(i) == 'R')
       {
          Rc++;   
         System.out.print(s.charAt(i));
       }
       
       if(Lc == Rc)
       { 
          cntr++; 
         System.out.println(); 
       }
     }
       System.out.println(cntr);
  }    
}
