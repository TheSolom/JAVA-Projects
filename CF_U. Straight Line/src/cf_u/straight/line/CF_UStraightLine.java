package cf_u.straight.line;
import java.util.Scanner;
public class CF_UStraightLine {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int x1 = sc.nextInt(), y1 = sc.nextInt();
     int x2 = sc.nextInt(), y2 = sc.nextInt();
     int x3 = sc.nextInt(), y3 = sc.nextInt();
    
  
     if((y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2))
      System.out.print("YES");
     else         
      System.out.print("NO");
         
  }
    
}
