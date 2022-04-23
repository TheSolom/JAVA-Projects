package rectangleoop;
public class Rectangle 
{
    
      double width;
      double height;
    
    public void setwidth(double w){
        this.width = w;
    }
    
    public void setheight(double h){
        this.height = h;
    }
    
    public double getwidth(){
        return width;
    }
    
    public double getheight(){
        return height;
    }
    
    public double getarea(){
        return width * height;
    }
    
    public double getcircum(){
        return 2*(width+height);
    }
    
    
}
