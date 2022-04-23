package cf_o.calculator;
import java.util.Scanner;
public class CF_OCalculator {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);     
    String op = null , S = sc.next();       
    int sub = 0;
    
   for(int i=0 ; i<S.length() ; i++) 
   {
     if( S.charAt(i) == '+' || S.charAt(i) == '-' || S.charAt(i) == '*' || S.charAt(i) == '/' )
     {
       op = String.valueOf( S.charAt(i) );
        sub = i; 
         break;
     }  
   }
    
     String num1 = S.substring(0 , sub);
     String num2 = S.substring(sub+1);
     
     switch(op) 
     {
       case "+" : System.out.println( Integer.parseInt(num1) + Integer.parseInt(num2) ); break;
       case "-" : System.out.println( Integer.parseInt(num1) - Integer.parseInt(num2) ); break;
       case "*" : System.out.println( Integer.parseInt(num1) * Integer.parseInt(num2) ); break;
       case "/" : System.out.println( Integer.parseInt(num1) / Integer.parseInt(num2) ); break;
     }
    
 }  
}
