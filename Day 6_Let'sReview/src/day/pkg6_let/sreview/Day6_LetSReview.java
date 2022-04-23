package day.pkg6_let.sreview;
import java.util.Scanner;
public class Day6_LetSReview {

    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();  String S;
          
      for(int A=0 ; A<T ; A++) 
       {
           S = sc.next(); 
        
        for(int B=0 ; B<=S.length()-1 ; B+=2 )
        { System.out.print(S.charAt(B)); }
        
              System.out.print(" ");
           
        for(int B=1 ; B<=S.length()-1 ; B+=2 )
        { System.out.print(S.charAt(B)); }      
        
              System.out.println();
      }            
 }
    
}
