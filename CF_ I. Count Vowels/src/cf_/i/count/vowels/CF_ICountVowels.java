package cf_.i.count.vowels;
import java.util.Scanner;
public class CF_ICountVowels {
   
  static int isVowel(char ch)
  {
     ch = Character.toUpperCase(ch);
     
     if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
      return 1; 
     else
      return 0;
  }           
    
  static int Count_Vowels(String s, int n)
  {
     int cntr = 0;
    
      if (n == 1)
      {
        return isVowel(s.charAt(n - 1)); 
      }
     
      if( isVowel(s.charAt(n-1)) == 1 ) // Check for vowel
      {  
        cntr++;
      }        
      
      return cntr + Count_Vowels(s,n-1);             
  }        
     
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();

      System.out.println(Count_Vowels(s,n));
    
  }
    
}
