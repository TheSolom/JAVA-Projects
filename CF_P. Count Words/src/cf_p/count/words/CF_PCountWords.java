package cf_p.count.words;
import java.util.Scanner;
public class CF_PCountWords {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);      
     String s = sc.nextLine();
     long cntr = 1;
     
     for(int i=0 ; i<s.length() ; i++)
     {
      if( (s.charAt(i) == ' ' || s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == ',' ) && s.charAt(i) != 0 )  
          cntr++;
     }
       System.out.println(cntr); 
  }  
}
