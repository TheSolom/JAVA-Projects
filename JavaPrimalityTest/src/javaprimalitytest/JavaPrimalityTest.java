package javaprimalitytest;
import java.math.BigInteger;
import java.util.Scanner;
public class JavaPrimalityTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
       BigInteger n = sc.nextBigInteger();
         
      System.out.println(n.isProbablePrime(10)? "prime" : "not prime");
  
  } 
}
 /* or 
        if(n<2){
      System.out.println("not prime"); return;
        } 
        
      if(n==2){
         System.out.println("prime");
        }
          
  for(int i=2 ; i<=100 ; i++ ) 
  {   
     if(n%n==0 & n%1==0)
     {
       if(n%i !=0) 
       {
           System.out.println("prime"); break;
       } 
       else 
           System.out.println("not prime");  break;     
     }    
  }                                                      */