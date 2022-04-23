package revision.oop;
/* inherits abstrcat superclass "Employee"
  and implements interface "Displayable" */
public class Hourly_Employee extends Employee implements Displayable{
    
   double Hour_rate;
   int Number_Hours;
   
    //Setters & Getters
     public double getHour_rate() {
        return Hour_rate;
     }

     public void setHour_rate(double Hour_rate) {
        this.Hour_rate = Hour_rate;
     }

    public int getNumber_Hours() {
        return Number_Hours;
     }

    public void setNumber_Hours(int Number_Hours) {
        this.Number_Hours = Number_Hours;
     }

    public Hourly_Employee(double Hour_rate, int Number_Hours, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.Hour_rate = Hour_rate;
        this.Number_Hours = Number_Hours;  }
    
   //return Hourly Employee Earning
  @Override
  public double Earning()
  {return Hour_rate * Number_Hours ; }
  
    //Print Hourly Earning
   @Override
   public void DisplayEarning()
   {System.out.println( Earning() );}
   
  //Display all details of Employees and Hourly Employees  
  @Override
  public void DisplayAllDetails()
  { System.out.println( toString() ); // Current class
    System.out.println( super.toString() ); } // "Employee" Class   
  
//Method using netbeans to show details and it used up in "DisplayAllDetails" Method          
@Override
public String toString() 
{ return "Hourly_Employee{" + "Hour_rate=" + Hour_rate + ", Number_Hours=" + Number_Hours + '}'; }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
