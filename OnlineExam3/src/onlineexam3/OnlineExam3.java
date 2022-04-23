package onlineexam3;
public class OnlineExam3 
{
    public static void main(String[] args) 
    {
      String x = "eslamashraf";
      int count =0;
      for(int i=0;i<x.length();i++)
      {
       char c = x.charAt(i);
        if (c=='s')
        {
          count +=1;
        }    
      }
      System.out.print(count);
         
    }
    
}
