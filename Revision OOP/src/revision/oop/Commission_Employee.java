package revision.oop;
/* inherits abstrcat superclass "Employee"
  and implements interface "Displayable" */
public class Commission_Employee extends Employee implements Displayable {
    
     double Gross_Sales;
     double Commission_rate;
     
      //Setters & Getters
      public double getGross_Sales() {
        return Gross_Sales;
      }

      public void setGross_Sales(double Gross_Sales) {
        this.Gross_Sales = Gross_Sales;
      }

      public double getCommission_rate() {
        return Commission_rate;
      }

      public void setCommission_rate(double Commission_rate) {
        this.Commission_rate = Commission_rate;
      }

    public Commission_Employee(double Gross_Sales, double Commission_rate, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.Gross_Sales = Gross_Sales;
        this.Commission_rate = Commission_rate;
    }
      
    //return Commission Employee Earning  
    public double Earning()
    { return  Gross_Sales * Commission_rate; }        
   
   //Print Commission Earning
   @Override
   public void DisplayEarning()
   { System.out.println( Earning() ); }
  
  //Display all details of Employees and Commission Employees
  @Override
  public void DisplayAllDetails()
  { System.out.println( toString() ); // Current class
    System.out.println( super.toString() ); } // "Employee" Class

//Method using netbeans to show details and it used up in "DisplayAllDetails" Method      
@Override
public String toString() {
return "Commission_Employee{" + "Gross_Sales=" + Gross_Sales + ", Commission_rate=" + Commission_rate + '}'; }
    
    
    
    
    
    
    
    
    
    
}
