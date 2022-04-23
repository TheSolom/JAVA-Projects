package cf_f.multiplication.of.matrices;
import java.util.Scanner;
public class CF_FMultiplicationOfMatrices {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);     
      int rows = sc.nextInt();
      int columns = sc.nextInt();

      int A[][] = new int[rows][columns];
      
       for(int i=0 ; i<rows ; i++)
        {            
          for(int j=0 ; j<columns ; j++)
          {
            A[i][j]=sc.nextInt();
          }
        }
       
      int rows2=sc.nextInt();
      int columns2=sc.nextInt();
      
      int B[][] = new int[rows2][columns2];
       
        for(int i=0 ; i<rows2;i++)
        {            
          for(int j=0 ; j<columns2;j++)
          {
            B[i][j]=sc.nextInt();
          }
        }
      
       int C[][] = new int[rows][columns2];
        
       for(int i=0 ; i<rows ; i++) // output rows
       {
        for(int j=0 ; j<columns2 ; j++) // output coloumns
        {
          for(int k=0 ; k<rows2 ; k++)  //elements in row or column
          {    
            C[i][j] +=  A[i][k] * B[k][j]; 
          }
        }
       }
 
        for(int i=0 ; i<rows ; i++)
        {            
          for(int j=0 ; j<columns2 ; j++)
          {
              System.out.print(C[i][j] + " ");
          }
            System.out.println();
        }
                
  }
    
}
