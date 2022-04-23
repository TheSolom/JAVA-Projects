package cf_a.add;
import java.util.Scanner;
public class CF_AAdd {
 
public static void main(String args[])  
{  
  Scanner sc = new Scanner(System.in);  
    int x, y, sum; 

   System.out.print("Enter the first number: ");  
    x = sc.nextInt();  

   System.out.print("Enter the second number: ");  
    y = sc.nextInt(); 

    sum = sum(x, y);  
   System.out.println("The sum of two numbers x and y is: " + sum);  
}  

//method that calculates the sum  
  public static int sum(int a, int b)  
  {  
    int sum = a + b;  
    return sum;  
  }  

} 
