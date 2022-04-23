package exam;

import java.util.Scanner;

public class Exam 
{

    public static void main(String[] args) 
    {
  Scanner input = new Scanner (System.in);
         int choice;
        do{
             int f,x;
            System.out.print("Enter the Number = ");
            f = input.nextInt();
            x = f - 1;
            while (x>0){
               f = f * x;
               x = x - 1; 
    }
           System.out.println("The factorial ="+f);
           System.out.println("Again (1-yes|2-no)");
           choice = input.nextInt();
        }
        while (choice==1);
        System.out.println("Good bye");
    }
    
    
}
