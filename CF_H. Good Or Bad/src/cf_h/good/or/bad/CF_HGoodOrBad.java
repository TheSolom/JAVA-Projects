package cf_h.good.or.bad;
import java.util.Scanner;
public class CF_HGoodOrBad {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
     int n = sc.nextInt();
       
  for(int t=0 ; t<n ; t++) 
  {
    String S = sc.next();    
     int cntr = 0; 
     
   for (int i=0; i<S.length() - 2 ; i++) 
   {
      if( (S.charAt(i) == '0' && S.charAt(i+1) == '1' && S.charAt(i+2) == '0') 
         || (S.charAt(i) == '1' && S.charAt(i+1) == '0' && S.charAt(i+2) == '1') )
      { 
        cntr = 1;
        break;  //without break increases the TIME
      }
   }

     if( cntr == 1 )
          System.out.println("Good");
     else
          System.out.println("Bad");

  }  
 }   
}
