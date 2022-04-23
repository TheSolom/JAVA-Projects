package cf_y.min.cost.string;
import java.util.Scanner;
public class CF_YMinCostString {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
     String s = sc.next();
     char[] chars = s.toCharArray();
     
     int[] x = new int[25];     
      for(int i=0 ; i<=25 ; i++) 
       x[i] = sc.nextInt();
          
     char letter = 97; //a
     
      for(int i=0 ; i<chars.length ; i++)
      {
        if(chars[i] == '?')
        {
           for (int j=1; j<=26 ; j++)
           {
             chars[i] = letter;
             Math.abs();
           }
        }
      }
     
     
  }  
}
