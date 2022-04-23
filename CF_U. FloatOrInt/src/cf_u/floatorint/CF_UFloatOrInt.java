package cf_u.floatorint;
import java.util.Scanner;
public class CF_UFloatOrInt {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
      float n = sc.nextFloat();    
      int y = (int) n;
      
      if( (n - y) > 0 )  //0.123  
          System.out.println( "float " + y + " " + (n-y) ); 
      else 
          System.out.println("int " + y );
  } 
}
