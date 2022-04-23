package javasubstringcomparisons;
import java.util.Scanner;
public class JavaSubstringComparisons {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);  
         
        String s = scan.nextLine();
         int i,k;
        k = scan.nextInt();
     String smallest = s.substring(0,k);
     String largest = s.substring(0,k);

        for(i=0 ; i<=s.length()-k ; i++) {
        
          //s.substring(i,i+k)   (0,3) (1,4) (2,5) -- wel , elc , lco
        
         if(smallest.compareTo( s.substring(i,i+k) ) < 0 )
            
        { smallest = s.substring(i,i+k); }
       
         if(largest.compareTo( s.substring(i,i+k) ) > 0 )
            
        { largest = s.substring(i,i+k); } 
         
       }
        
        System.out.println(largest);
        System.out.println(smallest);
        
        
        
    }
}

