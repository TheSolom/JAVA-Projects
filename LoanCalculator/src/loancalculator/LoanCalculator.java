package loancalculator;
 import java.util.Scanner;
public class LoanCalculator 
{
    public static void main(String[] args) 
    {

        	Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		for(int i=0; i<3 ; i++)
                {
		amount = (int) (amount - amount*0.1);
                }
               System.out.print(amount);		
		
	
    }
}
    

