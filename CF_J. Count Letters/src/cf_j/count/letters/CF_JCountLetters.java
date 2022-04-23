package cf_j.count.letters;
import java.util.Arrays;
import java.util.Scanner;
public class CF_JCountLetters {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);      
    String S = sc.nextLine();   
   
      char[] chars = S.toCharArray();
      Arrays.sort(chars);
      String str = String.valueOf(chars);  // or String str = new String(chars);

       int cntr = 0; 
       char letter = str.charAt(0);
      
     for(int i=0 ; i<str.length() ; i++)
     {       
       if(str.charAt(i) == letter)
           cntr ++; 

       else if(str.charAt(i) != letter)
       {
         System.out.println(letter + " : " + cntr);  
         letter = str.charAt(i);
         cntr = 1; 
       } 
          if( i == str.length()-1 )
         System.out.println(letter + " : " + cntr);
     }
 
    
//     char[] chars = S.toCharArray();
//      Arrays.sort(chars);
//
//   for(int i = 0 ; i < S.length() ; i++) 
//   {
//         char alpha = S.charAt(i);
//         int cntr = 1;                              not true
//         
//      while( S.charAt(i) == S.charAt(++i) )
//      {
//         cntr++; 
//      }    
//            i--;
//         System.out.println( alpha + " : " + cntr);  
//   }
       
 }   
}
