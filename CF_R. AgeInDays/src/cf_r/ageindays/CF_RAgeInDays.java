package cf_r.ageindays;
import java.util.Scanner;
public class CF_RAgeInDays {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);   
      int n = sc.nextInt(); 
      
 // Divide number to take year then take the reminder (divide it to take month and so on)
     System.out.println( (n/365) + " years");  //1
         n = n%365;  //35
      System.out.println( (n/30) + " months");  //1
          n = n%30;  //5
       System.out.println( n + " days");  
      
  }  
}
