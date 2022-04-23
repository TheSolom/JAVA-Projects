package revision.oop;
/* inherits superclass "Commission Employee"
  and implements interface "Displayable" */
public class BasePlusCommission_Employee extends Commission_Employee implements Displayable {
    
         double Base;
    
     //Getters & Setters
     public void setBase(double Base)
       { this.Base = Base; }    
         
     public double getBase()
         { return Base; }

   //return BasePlusCommission Employee Earning  
   @Override
   public double Earning()
   { return  super.Earning()+ Base; } // Earning()=(Gross_Sales * Commission_rate) ... From super class "Commission_Emplyee"
     
  //Print BasePlusCommission Earning
  @Override
  public void DisplayEarning()
  { System.out.println( Earning() ); }  
     
 //Display all details of Employees and Commission Employees
 @Override
 public void DisplayAllDetails()
 { System.out.println( toString() ); // Current class & // Can also use DisplayEarning()
    System.out.println( super.toString() ); } // "Employee" Class & // You Can also use Super.Displayalldetails

//Method using netbeans to show details and it used up in "DisplayAllDetails" Method   
@Override
public String toString() {
return "BasePlusCommission_Employee{" + "Base=" + Base + '}'; }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
