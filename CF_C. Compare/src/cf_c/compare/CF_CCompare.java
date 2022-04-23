package cf_c.compare;
import java.util.Scanner;
public class CF_CCompare {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);   
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
     int cntr = 0;    
   for(int i=0 , j=0 ; i < s1.length() && j < s2.length() ; i++, j++) 
   {
     if( s1.charAt(i) > s2.charAt(j) ) 
     {  System.out.println(s2); cntr++; return;  }
     if( s1.charAt(i) < s2.charAt(j) ) 
     {  System.out.println(s1); cntr++; return;  }
   }
   
     if( cntr == 0 )
     { 
      if(s1.length() < s2.length())   
       System.out.println(s1); 
       else
        System.out.println(s2);    
     }
 }   
}
