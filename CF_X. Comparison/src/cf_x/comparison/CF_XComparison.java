package cf_x.comparison;
import java.util.Arrays;
import java.util.Scanner;
public class CF_XComparison {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);  
      String s = scan.next();
      String cmp = s; 
      
     for (int i=1 ; i<s.length() ; i++)
     {
        String s1 = s.substring(0, i);
        String s2 = s.substring(i);
       
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
       
        Arrays.sort(chars1);
        Arrays.sort(chars2);
       
        s1 = String.valueOf(chars1);
        s2 = String.valueOf(chars2);
        
         if(cmp.compareTo(s1+s2) >= 0)       
           cmp = s1+s2;            
     }
   
       System.out.print(cmp);
  }    
}
