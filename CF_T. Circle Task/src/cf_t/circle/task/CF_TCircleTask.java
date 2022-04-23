package cf_t.circle.task;
import java.util.Scanner;
public class CF_TCircleTask {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int cx = sc.nextInt();
     int cy = sc.nextInt();
     int r = sc.nextInt();
     int n = sc.nextInt();
         
      for(int i=0 ; i<n ; i++)
      {
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        double d = Math.sqrt( Math.pow(cx-x,2)+Math.pow(cy-y,2) );
        
          if(d<=r)
           System.out.println("YES");   
          else
           System.out.println("NO");   
      }
  
   }
    
}
