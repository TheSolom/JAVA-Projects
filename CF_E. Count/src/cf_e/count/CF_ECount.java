package cf_e.count;
import java.util.Scanner;
public class CF_ECount {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);   
   String S = sc.next();    
    int sum = 0; 
    
    for (int i=0 ; i < S.length() ; i++) 
    {
     sum += S.charAt(i) - '0' ;
    }
    
       System.out.println(sum);
 }    
}
