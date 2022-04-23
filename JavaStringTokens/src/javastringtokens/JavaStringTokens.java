package javastringtokens;
import java.util.Scanner;
public class JavaStringTokens {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
 
      String arr[] = s.trim().split("[\\s!,?._'@]+");
    
       if (arr.length==0)    
     {  System.out.println("0");  } 
       
       System.out.println(arr.length);  
       for(int i=0 ; i<arr.length ; i++)
       {  System.out.println(arr[i]); }
      
      
      
      
      
      
        
 } 
   
}
