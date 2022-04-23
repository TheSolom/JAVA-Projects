package cf_c.sum.of.range;
import java.io.*;
import java.util.*;
public class CF_CSumOfRange {

 static void allnum(Long a , Long b){
   int sum = 0;
    for(Long i=a ; i<=b ; i++)
    {
       sum += i;
    }  
     System.out.println(sum);
 }
    
 static void evennum(Long a , Long b){
   int sum = 0;
    for(Long i=a ; i<=b ; i++)
    {
      if(i%2 == 0) 
       sum += i;          
    }  
     System.out.println(sum);  
 }
 
  static void oddnum(Long a , Long b){
   int sum = 0;
    for(Long i=a ; i<=b ; i++)
    {
      if(i%2 != 0) 
       sum += i;          
    }  
     System.out.println(sum);  
 } 
 
  public static void main(String[] args) {
    
   FastReader obj = new FastReader(); 
   Long a = obj.nextLong();
   Long b = obj.nextLong();
   
      if(a > b)
      {
        Long temp = a;  
        a = b;
        b = temp;
      }
       
     allnum(a,b);  
     evennum(a,b);
     oddnum(a,b);
     
  }
    
}


class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }