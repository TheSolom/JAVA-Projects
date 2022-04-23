package cf_w.circles;
import java.util.Scanner;
import static java.lang.Math.*;
public class CF_WCircles {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
    double x1 = sc.nextDouble(), y1 = sc.nextDouble();
    double x2 = sc.nextDouble(), y2 = sc.nextDouble();
    double x3 = sc.nextDouble(), y3 = sc.nextDouble();
    double x4 = sc.nextDouble(), y4 = sc.nextDouble();
     
     double center_x1 = (x1+x2)/2; 
     double center_y1 = (y1+y2)/2;
     double center_x2 = (x3+x4)/2;
     double center_y2 = (y3+y4)/2;
     
     double r1 = sqrt(pow(x1-x2,2) + pow(y1 - y2,2)) / 2;
     double r2 = sqrt(pow(x3-x4,2) + pow(y3 - y4,2)) / 2;
     
     double line = sqrt(pow(center_x1 - center_x2,2) + pow(center_y1 - center_y2,2));
     
     if(line > r1+r2)
      System.out.println("NO");
     else
      System.out.println("YES");
                
  }
    
}
