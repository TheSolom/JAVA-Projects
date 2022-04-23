package javaanagrams;
import java.util.Arrays;
import java.util.Scanner;
public class JavaAnagrams {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
                
   char[] A = a.toLowerCase().toCharArray();
   char[] B = b.toLowerCase().toCharArray();
      Arrays.sort(A); Arrays.sort(B);
      
       System.out.println( Arrays.equals(A,B) );
      
 }
    
}
