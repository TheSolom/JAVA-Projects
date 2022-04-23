package cf_o.sort.string;
import java.util.Scanner;
public class CF_OSortString {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);    
     int n = sc.nextInt();
     String s = sc.next();  
     char charArray[] = s.toCharArray();
     
    for(int i=0 ; i<n ; i++)
    {     
      for (int j=i+1 ; j<n ; j++) 
      {      
        if( charArray[i] > charArray[j] )  //Ascending
        {     
           char temp = charArray[i];
           charArray[i] = charArray[j];
           charArray[j] = temp;
        }  
      }             
    }
          
       System.out.println( String.valueOf(charArray) );
  }  
}
