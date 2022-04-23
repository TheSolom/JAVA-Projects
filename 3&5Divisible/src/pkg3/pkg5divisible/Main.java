package pkg3.pkg5divisible;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
 {
    
  Scanner input = new Scanner(System.in);
   System.out.println("Enter Number : ");
    int n = input.nextInt();
    int sum =0;
    
   for(int i=1 ; i<n ; i++)    
    {
      if(i%3==0 || i%5==0)
      sum = sum +i;
    }    
        System.out.println("Sum :" + sum);    
 }
    
}
