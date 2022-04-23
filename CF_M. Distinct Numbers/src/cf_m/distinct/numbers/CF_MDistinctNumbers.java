package cf_m.distinct.numbers;
import java.util.Scanner;
public class CF_MDistinctNumbers {
	
static int countDistinct(int A[], int n)
{
	int cntr = 0;

	// Pick all elements one by one
	for(int i=0 ; i<n ; i++)
	{
	    int j;
	    for(j=0 ; j<=i ; j++)
            {    
              if(A[i] == A[j])
		break;
            }    
		// If not printed earlier,
		// then print it
		if(i == j)
		 cntr++;
	}
	return cntr;
}


 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();  
	int A[] = new int[n];
        
     for(int i=0 ; i<n ; i++)
     {
       A[i] = sc.nextInt();
     }
	
    System.out.println(countDistinct(A, n));
 }

}


    

