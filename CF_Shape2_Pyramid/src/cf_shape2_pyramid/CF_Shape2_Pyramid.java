package cf_shape2_pyramid;
import java.util.Scanner;
public class CF_Shape2_Pyramid {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int k = 1;
      int sp = A-1;
      
       // outer loop to handle number of rows
       for (int i=1 ; i<=A ; i++)
	{
            
	   // inner loop to handle number spaces
	   // values changing acc. to requirement
	    for (int j= sp ; j>0 ; j--)
	    {
		// printing spaces     //or : "A-i" instead of sp
		System.out.print(" ");
	    }
                sp--;
                
	   // inner loop to handle number of columns
	   // values changing acc. to outer loop
	    for (int j=1 ; j<=k ; j++ )
            {
	      // printing stars & printing 1 then 3 then 5 then....
	       System.out.print("*");               
      	    }
                k +=2;
                
               // ending line after each row
                System.out.println();	
        }

  }  
}
