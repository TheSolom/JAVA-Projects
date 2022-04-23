package onlineexams;
import java.util.Scanner;
public class OnlineExams 
{
    public static void main(String[] args) 
    {
Scanner input = new Scanner (System.in);
 System.out.print("n : ");
    int n = input.nextInt();
        int sum = 0;
        int x;
     while (n>0){
     x = n % 10;
     sum+=x;
     n = n/10;
     }
     if (sum>10)
     {
     int sum2 = 0;
     int y;
     while (sum>0)
     {
     y = sum % 10;
     }
     }    
     System.out.print(sum);
    }
    
}
