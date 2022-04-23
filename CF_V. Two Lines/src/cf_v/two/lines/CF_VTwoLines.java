package cf_v.two.lines;
import java.util.Scanner;
public class CF_VTwoLines {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
    int x1 = sc.nextInt(), y1 = sc.nextInt(); 
    int x2 = sc.nextInt(), y2 = sc.nextInt();     
    int x3 = sc.nextInt(), y3 = sc.nextInt(); 
    int x4 = sc.nextInt(), y4 = sc.nextInt(); 
    
     int xx1 = x2 - x1;
     int yy1 = y2 - y1;
     int xx2 = x4 - x3;
     int yy2 = y4 - y3;
    
      if(yy1*xx2 == xx1*yy2)
       System.out.println("YES");    
      else
       System.out.println("NO");
    
  }
    
}
