package cf_y.easyfibonacci;
import java.util.Scanner;
public class CF_YEasyFibonacci {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);    
      int n = sc.nextInt();
        int first = 0, second = 1;
        
        if(n==1)
        { System.out.println("0"); return; }
        if(n==2)
        { System.out.println("0" + " " + "1"); return; }  
        
       else {
            
        System.out.print("0" + " " + "1"+ " ");
      for(int i=3 ; i<=n ; i++) 
      {
        int next = first + second; 
        
         System.out.print( next + " "); 
         
           first = second;  
            second = next; 
      }
                                                 }
 }
}
