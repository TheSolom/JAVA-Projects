package cf_l.string.functions;
import java.util.Arrays;
import java.util.Scanner;

public class CF_LStringFunctions {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);     
      int n = sc.nextInt();
      int q = sc.nextInt();
     String s = sc.next();
      n = s.length();
     String que;
  
    for (int i=1 ; i<=q ; i++)
    {
        que = sc.next();
  
     switch(que)
     {
       case "pop_back" :   s = s.substring( 0 , s.length()-1 );   break;
       case "front" :   System.out.println( s.charAt(0) );   break;
       case "back" :   System.out.println( s.charAt(s.length()-1) );   break; 
       case "sort" :   int e = sc.nextInt();  int r = sc.nextInt();  char charArray[] = s.toCharArray();  Arrays.sort(charArray, e-1 , r-1);  s = new String(charArray);   break;
       case "reverse" :   int x = sc.nextInt();  int y = sc.nextInt();  for(int j=y-1 ; j>=x-1 ; j--)  {System.out.print( s.charAt(j) );}  System.out.println("");  break;
       case "print" :   int pos = sc.nextInt();  System.out.println(s.charAt(pos-1));   break;
       case "substr" :   int a = sc.nextInt();  int b = sc.nextInt();  System.out.println( s.substring(a-1 , b) );   break;
       case "push_back" :   char z = sc.next().charAt(0);  System.out.println(s + z);   break;
     }
     
    }
     
  }  
}
