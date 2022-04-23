package cf_w.encrypt.decrypt.message;
import java.util.Scanner;
public class CF_WEncryptDecryptMessage {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int q = sc.nextInt();
     String s = sc.next();
            
         String Key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/"; 
    String Original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
    
       int j = 0; 
    
    if(q == 1)
    {
       for(int i=0 ; i<s.length() ; i++)
       {
         for(j=0 ; j<Original.length() ; j++)
         {
           if(s.charAt(i) == Original.charAt(j)) 
             break;     
         }
           System.out.print(Key.charAt(j));
       } 
    }
     else
     {
       for(int i=0 ; i<s.length() ; i++)
        {
          for(j=0 ; j<Key.length() ; j++)
          {
             if(s.charAt(i) == Key.charAt(j)) 
               break;      
          }
            System.out.print(Original.charAt(j));
        }
     }   
    
    
  }  
}
