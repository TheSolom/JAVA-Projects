package readmiddlefromthreenumbers;
import java.util.Scanner;
public class ReadMiddleFromThreeNumbers 
{
    public static void main(String[] args) 
    {//PROGRAM MADE BY ISLAM ASHRAF RAMADAN SECTION 8
     Scanner input = new Scanner (System.in);
        System.out.println("\t\tMiddle number from the three");
        System.out.println("\t\t----------------------------");
        int x,y,z,middle;
        
        System.out.println("Enter first number ");
        x= input.nextInt();
        System.out.println("Enter second number ");
        y= input.nextInt();
        System.out.println("Enter Third Number ");
        z= input.nextInt();     
        
        if(x>y)
           if(x<z)
           middle=x;
           else
           if(z>y)
           middle=z;
           else
           middle=y;  
        else
           if(y<z)
               middle=y;
           else
               middle=z;
        System.out.print("The middle number is "+middle);
    }
    
}
