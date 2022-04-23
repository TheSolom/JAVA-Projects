package cf_w.shape3;
import java.util.Scanner;
public class CF_WShape3 {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);  
    int N = 23;
    int k = 1;
    
//FOR MORE INFORMATIONS SEE "CF_shape2_pyramid" project 
    
    for(int i=1 ; i<=N ; i++)
    {             
 
       for(int j=N-i ; j>0 ; j--) 
       {
         System.out.print(" ");  
       }
      
         for(int j=1 ; j<=k ; j++)   //or (2*i)-1
         {
           System.out.print("*"); 
         }  
         
            k+=2;
        System.out.println();     
    }

       k-=2;  //to remove the extra k from previous state
    
     for (int i=N ; i>0 ; i--)
     {
      
        for (int j=0 ; j<N-i ; j++) 
        {
          System.out.print(" ");   
        }
  
         for(int j=k ; j>0 ; j--)
         {
           System.out.print("*");  
         }
  
            k-=2;
        System.out.println();   
     }
    
  } 
}
