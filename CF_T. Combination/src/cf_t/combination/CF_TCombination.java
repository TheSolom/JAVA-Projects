package cf_t.combination;
import java.util.Scanner;
public class CF_TCombination {

   static long Combination(int n, int r)
   { 
       if (r == 0 || r == n) 
       {
         return 1;  
       }
       else
        return Combination(n-1,r) + Combination(n-1,r-1);
   }  
    
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();  
     int r = sc.nextInt();
   
    System.out.println(Combination(n,r));
    
  } 
     
//https://stackoverflow.com/questions/20485602/how-do-i-write-a-recursive-function-for-a-combination
//https://mathworld.wolfram.com/PascalsFormula.html  
}
