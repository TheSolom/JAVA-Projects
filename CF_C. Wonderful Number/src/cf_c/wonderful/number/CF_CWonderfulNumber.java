package cf_c.wonderful.number;
import java.util.Scanner;
public class CF_CWonderfulNumber {

    
  static boolean IsOdd(int n, boolean cntr){
      
      if(n%2 != 0)
       cntr = true;
      else
       cntr = false;   
      
     return cntr; 
  }   
  
  static boolean IsPalindrome(int n, boolean cntr){    
          
    String bi = Integer.toBinaryString(n);

    for(int i=0,j=bi.length()-1 ; i<bi.length() && j>=0 ; i++,j--) 
    {
       if(bi.charAt(i) != bi.charAt(j)) 
       { 
          return cntr = false;
       }                  
    }
     return cntr = true;
  }
    
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();
    boolean cntr = false;
    
      if(IsOdd(n,cntr) && IsPalindrome(n,cntr))
        System.out.println("YES");  
      else
        System.out.println("NO");
    
  }  
  
}
 