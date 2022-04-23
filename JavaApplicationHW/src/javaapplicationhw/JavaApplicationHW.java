package javaapplicationhw;
public class JavaApplicationHW
{
   public static void main(String[] args) 
   {
// Program made by Islam Ashraf Ramadan from section 8
    String xString  = args[0];
    String operator = args[1];
    String yString  = args[2];
    
    int x = Integer.parseInt(xString);
    int y = Integer.parseInt(yString);
    int r = 0;
    
    switch(operator)
    
     {  
        case "+" : r=x+y;  break;
        case "-" : r=x-y;  break;
        case "*" : r=x*y;  break;
        case "/" : r=x/y;  break;
     }
    System.out.print("The result is : " + r);
   }
}