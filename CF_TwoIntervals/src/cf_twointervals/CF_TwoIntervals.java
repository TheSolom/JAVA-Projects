package cf_twointervals;
import java.util.Scanner;
public class CF_TwoIntervals {
    
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
        
     System.out.print("Enter interval one: ");
      int left1 = sc.nextInt();
      int right1 = sc.nextInt();
        
     System.out.print("Enter interval two: ");
      int left2 = sc.nextInt();
      int right2 = sc.nextInt();

       int end1 = 0;
       int end2 = 0;
        int cntr = 0;
        
        if(left1 >= left2 && left1 <= right2)
        { 
          end1 = left1;
           cntr++;
        }
        if(right1 >= left2 && right1 <= right2)
        { 
          end2 = right1;
           cntr++;
        }   
        if(left2 >= left1 && left2 <= right1)
        {
          end1 = left2;
           cntr++;
        }

        if(right2 >= left1 && right2 <= right1)
        {
          end2 = right2;
           cntr++;
        }

       if(end1 > end2){
           int h = end1;
            end1 = end2;
            end2 = h;           
        }
       
       if(cntr > 0)
        System.out.println(end1 + " " + end2);       
       else
        System.out.println("-1");   
     
  }   
}
