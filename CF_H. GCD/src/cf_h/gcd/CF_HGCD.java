package cf_h.gcd;
import java.util.Scanner;
public class CF_HGCD {

 static Long gcd(Long a,Long b){
    while(b!=0)
    {
      Long temp_a = a;   // (a,b) >> (b,a%b)  //Euclidean Algorithm
      a = b ;
      b = temp_a % b;
    } 
     return a;
 }  
    
 static Long lcm(Long a,Long b){
     
   return a/gcd(a,b)*b;         
 }
    
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();  

     System.out.println(gcd(a,b) + " " + lcm(a,b));         
      
  }
    
}
