package cf_v.pum;
import java.util.Scanner;
public class CF_VPUM {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int counter = 0;
     for (int i = 1 ; counter != A ; i++) 
     {
        
       if( i%4 == 0)
       {
          System.out.println("PUM");
            i++;  counter++;
       } 
       
         if(counter != A)
         System.out.print(i + " ");
         
     }  
    
  } 
}
