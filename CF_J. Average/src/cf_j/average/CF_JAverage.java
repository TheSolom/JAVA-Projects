package cf_j.average;
import java.util.Scanner;
public class CF_JAverage {   
    
  static void Avg(int n, double[] A){
  
    double avg = 0;  
     for(int i=0 ; i<n ; i++)
     {
       avg += A[i];   
     }
  
     System.out.format("%.7f", avg/n);
  }
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();    
      double[] A = new double[n];
    
      for(int i=0 ; i<n ; i++)
      {
        A[i] = sc.nextDouble();
      }
      
      Avg(n,A);
  }
    
}
