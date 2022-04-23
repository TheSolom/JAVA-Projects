package maxfournumbers;
import java.util.Scanner;
public class MaxFourNumbers 
{
    public static void main(String[] args)
    {//PROGRAM MADE BY ISLAM ASHRAF RAMADAN SECTION 8
       Scanner input = new Scanner (System.in);
       System.out.println("\t\tMax of four numbers");
       System.out.println("\t\t--------------------");
        int V,X,Y,Z,max;
        
        System.out.println("Enter first number ");
        V= input.nextInt();
        System.out.println("Enter second number ");
        X= input.nextInt();
        System.out.println("Enter Third Number ");
        Y= input.nextInt();     
        System.out.println("Enter fourth number ");
        Z= input.nextInt();
        
        if(V>X&V>Y&V>Z)   
           max=V;
           else
           if(X>Z&X>Z)
           max=X;
           else        
           if(Y>Z)
           max=Y;
        else
           max=Z;    
        System.out.println("The Max Number is "+max);
 }
    
}
