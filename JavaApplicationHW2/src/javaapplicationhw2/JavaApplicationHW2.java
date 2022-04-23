package javaapplicationhw2;
import java.util.Arrays;
public class JavaApplicationHW2 
{
    public static void main(String[] args)
    {
     int a[][]=new int[8][8];
        for(int row =0;row<a.length;row+=2){
            for(int col=0;col<a.length;col++){
                a[row][col]=5;
            }
        }
        for(int row=0;row<a.length;row++){
            System.out.println(Arrays.toString(a[row]));
        }
    }
    
}
