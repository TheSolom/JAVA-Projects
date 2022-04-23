package anyjavaapplication;
import java.util.Scanner;
public class AnyJavaApplication 
{
    public static void main(String[] args) 
    {
Scanner input = new Scanner(System.in);
System.out.print("Enter base x ");
int x = input.nextInt();
System.out.print("Enter power y ");
int y = input.nextInt();
int p = 1;
while(y>=1)
 {   
p*=x;
y--;
 }
System.out.print("POWER = "+ p);
    }   
}
