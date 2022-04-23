package onlineexam2;
import java.util.Scanner;
public class OnlineExam2 
{
  public static void main(String[] args) 
 {
    Scanner input = new Scanner (System.in);   
    System.out.print("n = ");
    int n = input.nextInt();
    int i,sum=0;
    for(i=0 ; i<n ; i++)
    {
     if (i%2!=0)
      {
        sum+=i;
      }
    }
     System.out.print(sum);
 }
    
}
