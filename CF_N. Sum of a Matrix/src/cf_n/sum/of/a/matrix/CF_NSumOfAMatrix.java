package cf_n.sum.of.a.matrix;
import java.util.Arrays;
import java.util.Scanner;
public class CF_NSumOfAMatrix {

   static void Sum_Matrix(int[][] A, int[][] B,int[][] res, int R, int C)
   {
       if(C == 0)
       {
         Sum_Matrix(A,B,res,R-1,C);  
       }
       if(R == 0)
       {
         Sum_Matrix(A,B,res,R,C);
       }
       
        res[R][C] = A[R][C] + B[R][C];  

        Sum_Matrix(A,B,res,R,C-1);
        
   }  
       
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int R = sc.nextInt();
     int C = sc.nextInt();
     int[][] A = new int[R][C];
     int[][] B = new int[R][C];
     int[][] res = new int[R][C];
     
     for(int i=0 ; i<R ; i++)
     {
       for(int j=0 ; j<C ; j++)
       {     
         A[i][j] = sc.nextInt();
       }
     }
     
     for(int i=0 ; i<R ; i++)
     {
       for(int j=0 ; j<C ; j++)
       {     
         B[i][j] = sc.nextInt();
       }
     }  
   
      Sum_Matrix(A,B,res,R-1,C-1); 
      
      for(int i=0 ; i<R ; i++)
     {
       for(int j=0 ; j<C ; j++)
       {     
          System.out.println(res[i][j]);
       }
     }  
 
  }
    
}

