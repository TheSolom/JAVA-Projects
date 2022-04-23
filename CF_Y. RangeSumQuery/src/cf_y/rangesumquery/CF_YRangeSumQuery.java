package cf_y.rangesumquery;
import java.util.Scanner;
public class CF_YRangeSumQuery {
    
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
     int N = sc.nextInt();
     long Q = sc.nextLong();
    long[] arr1 = new long[N+1]; 
    long[] arr2 = new long[N+1];
  for(int i=1 ; i<=N ; i++) 
  {
    arr1[i] = sc.nextLong();  // Input primitive Array
  }           

   for(int i=1 ; i<=N ; i++)  
   {   
     if(i==1)
      arr2[i] = arr1[i]; 
     else                                    //6 ,(6+4)>10 ,(6+4+2)>12 ...... 
      arr2[i] = arr1[i] + arr2[i-1]; 
   }   
   
     for(int j=0 ; j<Q ; j++) 
     {   
       long sum = 0L;  
       int L = sc.nextInt();                     //0 2   12-6 = 6 + index of 0 (6) = 12
        int R = sc.nextInt();                    //2 5   28-12 = 16 + index of 2 (2) = 18
         
        sum = (arr2[R] - arr2[L]) + arr1[L];  
        
         System.out.println(sum);
     }    
    
 }
}
