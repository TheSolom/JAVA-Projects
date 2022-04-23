package charconvertcase;
import java.util.Scanner;
public class CharConvertCase {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0); 
     
       if (Character.isUpperCase(ch)) 
       {
          int convert = (int) ch;
           convert = ch + 32;
           ch = (char) convert;
          System.out.println(ch);
       } 
       
    else 
       if (Character.isLowerCase(ch)) {
       int convert = (int) ch;
           convert = ch - 32;
           ch = (char) convert;
          System.out.println(ch);
       
       }
       
       
       
       
    }  
}
