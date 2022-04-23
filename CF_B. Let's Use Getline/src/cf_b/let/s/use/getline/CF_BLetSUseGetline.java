package cf_b.let.s.use.getline;
import java.util.Scanner;
public class CF_BLetSUseGetline {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    
    String S = sc.nextLine();
     
  for(int i = 0 ; i < S.length() ; i++)
  { 
    if( S.charAt(i) != '\\' )      
     System.out.print( S.charAt(i) );
    else
     return;   
  }
  
 }   
}
