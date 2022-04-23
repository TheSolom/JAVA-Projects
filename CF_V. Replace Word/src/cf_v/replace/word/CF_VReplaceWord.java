package cf_v.replace.word;
import java.util.Scanner;
public class CF_VReplaceWord {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     String s = sc.next();
     
      String str = s.replaceAll("EGYPT", " ");
       System.out.println(str);
  }   
}
