package cf_r.string.score;
import java.util.*;
public class CF_RStringScore {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  
      int n = scan.nextInt();
      String s = scan.next();
      
      char[] chars = s.toCharArray();
      int cntr = 0;
      
     for(int i=0 ; i<n ; i++)
     {  
        if(chars[i] == 'V') 
          cntr += 5;  
       
        
        if(chars[i] == 'W')
          cntr += 2;   
        
        
        if(chars[i] == 'X')
        {           
          chars[i+1] = '0';
        }
       
        
        if(chars[i] == 'Y')
        {    
          //arraylist
        }
        
        
        if(chars[i] == 'Z')
        {
          if(chars[i+1] == 'V')  
          {
            cntr /= 5;
            chars[i+1] = '0';
          }  
          
          if(chars[i+1] == 'W')
          { 
            cntr /= 2;  
            chars[i+1] = '0';
          }
        }
        
     }
          s = String.valueOf(chars);
          System.out.print(s);
          System.out.println("");
          System.out.println(cntr);
  }  
}
