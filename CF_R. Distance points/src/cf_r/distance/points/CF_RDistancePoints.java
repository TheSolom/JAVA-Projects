package cf_r.distance.points;
import java.util.Scanner;
public class CF_RDistancePoints {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int x1 = sc.nextInt();
     int y1 = sc.nextInt();
     int x2 = sc.nextInt();
     int y2 = sc.nextInt();
       
     
    System.out.printf("%.9f", Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)) );
                                         // sqrt( (x2-x1)^2 + (y2-y1)^2 )
  }
    
}
