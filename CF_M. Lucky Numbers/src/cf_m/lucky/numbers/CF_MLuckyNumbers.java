package cf_m.lucky.numbers;
import java.util.Scanner;
public class CF_MLuckyNumbers {
    
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
     int digit = 0;
     int cntr = 0;
     int lucky = 0;
     
  for(int i=a ; i <= b ; i++) 
  {
      int num = i;
       cntr = 0;
      
    while(num !=0)
    {    
        digit = num % 10 ;
         num = num / 10 ; 
     
       if(digit != 4 && digit != 7)      
       {  
         cntr = 1;
         break;
       }  
    } 
      if(cntr == 0)
      {
        System.out.print(i + " ");   
         lucky++;
      }
  }
   
    if(lucky == 0)
     System.out.println("-1"); 
 }   
}
