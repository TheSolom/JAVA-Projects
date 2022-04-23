package studentdegree;
import java.util.Scanner;
public class StudentDegree {

    private static Object input;

    public static void main(String[] args) 
  {
 Scanner input= new Scanner (System.in);
System.out.println("Show Student Grade");
System.out.println("------------------");
double x;
System.out.print("Enter student degree ");
x= input.nextDouble();

if (x<50)
 System.out.print("Fail");
else
 if(x>50&x<65)
  System.out.print("Accept");
else
 if(x<75)
  System.out.print("Good");
else
 if(x<85)
  System.out.print("Very good");
 else
  System.out.print("Exellent");
  

  }
    
}
