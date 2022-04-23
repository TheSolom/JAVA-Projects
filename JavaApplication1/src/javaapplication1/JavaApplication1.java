package javaapplication1;
import java.util.Scanner;
public class JavaApplication1
{
    public static void main(String[] args) 
    {
    Scanner input = new Scanner (System.in);
    
     //This is a program for calculating rectangle area and circum
     
            Double length, width, area, circum;
            
            System.out.print("Enter the rectange length  ");
            length = input.nextDouble();
            
            System.out.print("Enter the rectangle width  ");
            width = input.nextDouble();
            
            circum = 2 * (length+width);
            area = length * width ;
            
            System.out.println("The rectangle circum =" +circum);
            System.out.println("The rectangle area =" +area);
            
            
            System.out.println("Enter the rectange length");
            length = input.nextDouble();
            if (length >=3)
                    System.out.println("cong you are awesome \nFuck احاyou");
    }
    
}
