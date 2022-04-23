package cf_thebrothers;
import java.util.Scanner;

public class CF_TheBrothers {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
         String second1 = null;
        String name2 = sc.nextLine();
         String second2 = null;
        
      for(int i=0 ; i<name1.length() ; i++)
        {
           if(name1.charAt(i)== ' ' ) 
           { second1 = name1.substring(i); }
        }
        
       for(int k=0 ; k<name2.length() ; k++)
        {
           if(name2.charAt(k)== ' ' ) 
           { second2 = name2.substring(k); }
        }
       
       if(second1.equals(second2))
            System.out.println("ARE Brothers");
       else System.out.println("NOT");
       
    }
    
}
