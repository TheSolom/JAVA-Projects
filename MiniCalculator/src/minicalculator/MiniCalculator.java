package minicalculator;
import java.util.Scanner;
public class MiniCalculator
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner (System.in);
     
     System.out.println("Mini Standard calculator");
     System.out.println("-------------------------");
     
     System.out.println("Enter the equation : ");
     int x = input.nextInt();
     String op = input.next();
     int y = input.nextInt();
     int r = 0;
     
     switch(op)
     {
         case "+" : r = x+y;
         break;
         case "-" : r = x-y;
         break;
         case "*" : r = x*y;
         break;
         case "/" : r = x/y;
         break;
         case "%" : r = x%y;
         break; 
         default :
         System.out.print("Math Error");
     }
    
     System.out.println("Result = " + r);
    }
    
}
