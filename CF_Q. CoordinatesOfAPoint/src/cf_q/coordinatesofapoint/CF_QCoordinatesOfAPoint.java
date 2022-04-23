package cf_q.coordinatesofapoint;
import java.util.Scanner;
public class CF_QCoordinatesOfAPoint {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
      double x = sc.nextDouble();  
      double y = sc.nextDouble();
        
     if(x==0 && y==0)   
       System.out.println("Origem");  
     else if(x==0) 
       System.out.println("Eixo Y");     
     else if(y==0)  
       System.out.println("Eixo X");  
     
     if(x>0 && y>0)
       System.out.println("Q1");
     if(x<0 && y>0)
       System.out.println("Q2");
     if(x<0 && y<0)
       System.out.println("Q3");
     if(x>0 && y<0)
       System.out.println("Q4");
     
     
  } 
}
