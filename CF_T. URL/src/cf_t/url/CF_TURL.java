package cf_t.url;
import java.util.Scanner;
public class CF_TURL {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
      String s = sc.next();  
      
     for(int i=s.indexOf('?')+1 ; i<s.length() ; i++)
     {
        if(s.charAt(i) == '&')
        {
          System.out.println();
           continue;
        }
        
             System.out.print( s.replace('=',':').charAt(i) );
        
        if(s.charAt(i) == '=')
         System.out.print(" ");
     }
     
  }   
}
