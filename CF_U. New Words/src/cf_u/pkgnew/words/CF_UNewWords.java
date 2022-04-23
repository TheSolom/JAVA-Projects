package cf_u.pkgnew.words;
import java.util.Scanner;
public class CF_UNewWords {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
      String s = sc.next();
      int Ce=0,Cg=0,Cy=0,Cp=0,Ct=0;
      
    for(int i=0 ; i<s.length() ; i++)
    {
      if(s.charAt(i) == 'E' || s.charAt(i) == 'e')
        Ce++;
     
      if(s.charAt(i) == 'G' || s.charAt(i) == 'g')
        Cg++;
      
      if(s.charAt(i) == 'Y' || s.charAt(i) == 'y')
        Cy++;
      
      if(s.charAt(i) == 'P' || s.charAt(i) == 'p')
        Cp++;
      
      if(s.charAt(i) == 'T' || s.charAt(i) == 't')
        Ct++;
    }
  
    if(Ce == Cg && Ce == Cy && Ce == Cp && Ce == Ct )
      System.out.println(Ce); 
     else
     {
       int min1 = Integer.min(Ce, Cg);
       int min2 = Integer.min(Cy, Cp);
       int min3 = Integer.min(min1, min2);
        System.out.println( Integer.min(min3, Ct) );
     }  
    
  }   
}
