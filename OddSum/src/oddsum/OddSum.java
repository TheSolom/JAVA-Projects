package oddsum;
 import java.util.Scanner;
public class OddSum 
{
 public static void main(String[] args)
 {
   Scanner input = new Scanner(System.in);
   
    System.out.println("Enter limit : ");
     int limit = input.nextInt();
     int sum = 0;
     
   for(int i=1 ; i<=limit ; i++)                                               
   {
       
    if (i%2 != 0)
     sum = sum + i; 
    
   }   
    System.out.println("sum : " + sum);
 }
    
}
