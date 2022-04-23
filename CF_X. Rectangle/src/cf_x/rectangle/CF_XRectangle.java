package cf_x.rectangle;
import java.util.Scanner;
import static java.lang.Math.*;
public class CF_XRectangle {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt(), y1 = sc.nextInt();
    int x2 = sc.nextInt(), y2 = sc.nextInt();
    int x3 = sc.nextInt(), y3 = sc.nextInt();
    int x4 = sc.nextInt(), y4 = sc.nextInt();
     
    int min_x = min( min(x1,x2),min(x3,x4) ); //smallest x in rectangle
    int max_x = max( max(x1,x2),max(x3,x4) ); //biggest x in rectangle
    int min_y = min( min(y1,y2),min(y3,y4) ); //smallest y in rectangle
    int max_y = max( max(y1,y2),max(y3,y4) ); //biggest y in rectangle
    
     int n = sc.nextInt();
      for(int i=0 ; i<n ; i++)
      {
         int xi = sc.nextInt(), yi = sc.nextInt();
          
         if (xi >= min_x && xi <= max_x && yi >= min_y && yi <= max_y)
          System.out.println("YES");
	 else 
	  System.out.println("NO");
      }
        
         
  }
    
}
