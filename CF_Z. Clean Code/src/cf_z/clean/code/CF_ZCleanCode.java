package cf_z.clean.code;
import java.util.Scanner;
public class CF_ZCleanCode {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
    String s;
    
     boolean mf = true;
     
    while(sc.hasNextLine())
    {
       s = sc.nextLine();
          
      boolean sf = false;
    
       if(s.length() == 0 || s == " ")
       {
	 continue;
       }
       
      for(int i=0 ; i<s.length() ; i++)
      {
        if(s.charAt(i) == '/' && s.charAt(i+1) == '/' && mf) 
        {  
           break;       
        }
        else if(s.charAt(i) == '/' && s.charAt(i+1) == '*')
             {
                i++;
                mf = false;
             } 
        else if(s.charAt(i) == '*' && s.charAt(i+1) == '/' && !mf)  
             {
                i++;
                mf = true;
             } 
        else if(mf == true)
             {
               System.out.print(s.charAt(i));
                 sf = true;
             }      
      }
      
       
        if(sf && mf)
        {
          System.out.println();
        }
    
       
    }   
       
    
    
  }  
  
}
