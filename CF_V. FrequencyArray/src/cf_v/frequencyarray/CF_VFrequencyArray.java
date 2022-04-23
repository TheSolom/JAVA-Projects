package cf_v.frequencyarray;
import java.util.Arrays;
import java.util.Scanner;
public class CF_VFrequencyArray {
    
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int M = sc.nextInt(); 
     
   int[] A = new int[100000];
    Arrays.fill(A , 0);
     
    for(int i=0 ; i<N ; i++) 
    {
       int num = sc.nextInt();
      
      if(A[num] == 0)
       A[num] = 1;
      else 
       A[num] = A[num] + 1; 
    }
    
      for(int i=1 ; i<=M ; i++)
      {
        System.out.println(A[i]);
      }
 }  
}
