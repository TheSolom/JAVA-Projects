package cf_x.pkg8.neighbors;
import java.util.Scanner;
public class CF_X8Neighbors {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt();
      int m = sc.nextInt();
    char[][] A = new char[101][101];
      
  for(int i=1 ; i<=n ; i++) 
  {
   for(int j=1 ; j<=m ; j++) 
   {
     A[i][j] = sc.next().charAt(0); 
   }
  }      
      int x = sc.nextInt();
      int y = sc.nextInt();
  
     if( A[x][y-1] != '.' && A[x][y+1] != '.' ) 
         if( A[x-1][y] != '.' && A[x-1][y-1] != '.' && A[x-1][y+1] != '.' )
          if( A[x+1][y] != '.' && A[x+1][y-1] != '.' && A[x+1][y+1] != '.' )  
              
          System.out.println("yes"); 

     else
          System.out.println("no");    
      
 } 
}
