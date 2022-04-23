package twomaxfournumbers;
import java.util.Scanner;
public class TwoMaxFourNumbers {
    public static void main(String[] args) 
    {
     Scanner input = new Scanner (System.in);
     System.out.println("Find The Max two numbers");
     System.out.println("------------------------");
     int x,y,z,h;
     System.out.println("Enter first number ");
     x= input.nextInt();
     System.out.println("Enter second number ");
     y= input.nextInt();
     System.out.println("Enter third number ");
     z= input.nextInt();
     System.out.println("Enter Fourth number ");
     h= input.nextInt();
     if(x>y&&x>z&&x>h&&y>z&&y>h||y>x&&y>z&&y>h&&x>z&&x>h)
     System.out.println("The Max Two Numbers " +x+ " and " +y);
     else
     if(h>x&&h>y&&h>z&&z>y&&z>x||z>h&z>x&&z>y&&h>x&&h>y)
     System.out.println("The Max Two Numbers "+h+" and "+z);
      else
       if(x>z&&x>h&&x>y&&z>y&&z>h||z>x&&x>h&&x>y&&z>y&&z>h)
        System.out.println("The Max Two Numbers "+x+" and "+z);
        else
        if(x>z&&x>h&&x>y&&h>z&&h>y||h>x&&x>z&&x>y&&h>y&&h>z)
            System.out.println("The Max Two Numbers "+x+" and "+h);
        else
          if(x>z&&x>h&&x>y&&h>z&&h>y||y>h&&h>x&&h>z&&y>z&&y>x)
            System.out.println("The Max Two Numbers are "+h+" and "+y);
        else
          if(y>z&&y>x&&y>h&&z>x&&z>h||z>y&&y>x&&y>h&&z>x&&z>h)
     System.out.println("The Maximum Two Numbers are " +y+ " and " + z);

    }
    
}
