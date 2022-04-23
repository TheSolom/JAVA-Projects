package factorialprogram;
import java.util.Scanner;
public class FactorialProgram 
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Factorial Prog");
    System.out.println("--------------");
    int choice;
    do {
         int x= 1;
         int f =1;
        System.out.print("Enter n = ");
        int n = input.nextInt();
    do { 
        f = f*x;
        x = x+1; //x++
      }while(x<=n);
        System.out.println("factorial =" +f);
        System.out.println("again 1-YES 2-NO ");
        choice = input.nextInt();
     }
    while (choice==1);
    
        System.out.println("The end");
    }
}
    
