package cf_b.print;
import java.util.Scanner;
public class CF_BPrint {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();
     allNum(n);
  }  
 
//method that calculates the print all numbers to n 
  public static void allNum(int n)  
  {  
      for(int i=1 ; i<=n ; i++) 
      {
        if(i != n) 
         System.out.print(i + " ");
        else
         System.out.print(i);   
      }   
  }
 
}
