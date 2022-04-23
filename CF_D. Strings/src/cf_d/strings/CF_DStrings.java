package cf_d.strings;
import java.util.Scanner;
public class CF_DStrings {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);   
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();

     System.out.println( s1.length() + " " + s2.length() );
     System.out.println(s1+s2);
     
     char[] ch1 = s1.toCharArray();
     char[] ch2 = s2.toCharArray();  
     
      char temp = ch1[0];
      ch1[0] = ch2[0];
      ch2[0] = temp;
     
     System.out.println( String.valueOf(ch1) + " " + String.valueOf(ch2) );
 }    
}
