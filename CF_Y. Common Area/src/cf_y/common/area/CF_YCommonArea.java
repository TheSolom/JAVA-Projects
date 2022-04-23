package cf_y.common.area;
import java.util.Scanner;
public class CF_YCommonArea {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      int T = sc.nextInt(); 
        
      for(int i=1 ; i<=T ; i++)
      {
        int n = sc.nextInt();
        
        long x1 = sc.nextLong(),y1 = sc.nextLong(); //Lower-left point (x1,y1)
        long x2 = sc.nextLong(),y2 = sc.nextLong(); //Upper right point (x2,y2)
        long max_x = x1, max_y = y1 , min_x = x2, min_y = y2;
        
         for(int j=1 ; j<n ; j++)
         {
            x1 = sc.nextLong(); y1 = sc.nextLong();
            x2 = sc.nextLong(); y2 = sc.nextLong();
            
           max_x = Math.max(max_x,x1);
           max_y = Math.max(max_y,y1); 
           min_x = Math.min(min_x,x2);
           min_y = Math.min(min_y,y2);
           
          // area = (min_y - max_y) * (min_x - max_x);  //Area = Length*Width
           
         }  
          
          if(min_x > max_x && min_y > max_y)
           System.out.println("Case #" + i + ": " + (min_y - max_y) * (min_x - max_x)); 
          else
           System.out.println("Case #" + i + ": 0");                              
      }
   
   
   }   
}
