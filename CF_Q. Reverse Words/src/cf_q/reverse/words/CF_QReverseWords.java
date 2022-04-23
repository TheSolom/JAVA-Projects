package cf_q.reverse.words;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Collectors;
public class CF_QReverseWords {

  public static void main(String[] args) throws IOException { 
   BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
      
       String result = Arrays.asList( s.split("\\s") )
                        .stream()
                        .map( str -> new StringBuilder(str).reverse() )
			.collect( Collectors.joining(" ") );
       
           log.write(result);
            log.flush();
    
//      String temp = "";
//      String reverse = "";
//      
//   Stack<Character> str = new Stack<>();  
//     
//     for (int i=0 ; i<s.length() ; i++)
//     {
//       str.push(s.charAt(i));
//     }
// 
//      while(!str.isEmpty())
//      {
//        if( Character.isLetter(str.peek()) )  
//           temp += str.pop();
//        else
//         {   
//           reverse = " " + temp + reverse;
//            temp = "";
//             str.pop();
//         }   
//      }
//
//         if(temp != "")
//           reverse = temp + reverse;
//     
//      System.out.println(reverse);   
     
//  or   
//     String reversed = "";
//     String[] word = s.split("\\s");
//     
//      for(int i=0 ; i<word.length ; i++) 
//      {
//        StringBuilder sb = new StringBuilder(word[i]); 
//        reversed += sb.reverse() + " ";
//      }
//  
//      log.write(reversed.substring(0, reversed.length()-1) );  //or reversed.trim()
//      log.flush();
        
   }   
}
