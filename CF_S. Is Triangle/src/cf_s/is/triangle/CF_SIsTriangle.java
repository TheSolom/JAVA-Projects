package cf_s.is.triangle;
import java.util.Scanner;
public class CF_SIsTriangle {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      double  a = sc.nextDouble();    
      double  b = sc.nextDouble();
      double  c = sc.nextDouble();
      
      if(a+b>c && a+c>b && b+c>a) 
      {
          System.out.println("Valid"); 
         double  s = a+b+c; //Semi Perimeter to be used in Heron’s Area
          System.out.printf("%.6f",Math.sqrt((s/2)*(s/2 - a)*(s/2 - b)*(s/2 - c)));
      }
       else
         System.out.println("Invalid");   
  } 
    
}
