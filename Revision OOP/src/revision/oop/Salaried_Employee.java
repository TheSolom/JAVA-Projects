package revision.oop;

/* inherits abstrcat superclass "Employee"
  and implements interface "Displayable" */
public class Salaried_Employee extends Employee implements Displayable{
    
   double Salary,Bonus,Deductions;
  
    //Setters & Getters
     public void SetSalary (double Salary)
     { this.Salary = Salary; }  

     public double getSalary()
     { return Salary; }
 
     public void setBonus(double Bonus)
     { this.Bonus = Bonus; }
        
     public double getBonus()
     { return Bonus; }

     public void setDeductions(double Deductions)
     { this.Deductions = Deductions; }

     public double getDeductions() 
     { return Deductions; }

    public Salaried_Employee(double Salary, double Bonus, double Deductions, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Deductions = Deductions;  }
 
 //return Salaried Employee Earning
 @Override
 public double Earning()
 {return Salary + Bonus - Deductions; }
 
   //Print S.E. Earning
   @Override
   public void DisplayEarning()
   { System.out.println( Earning() ); }
   
  //Display all details of Employees and S.E. Employees 
  @Override
  public void DisplayAllDetails()
  { System.out.println( toString() ); // Current class
    System.out.println(super.toString() ); } // "Employee" Class 
  
//Method using netbeans to show details and it used up in "DisplayAllDetails" Method
@Override
public String toString() {
return "Salaried_Employee{"+"Salary= " +Salary+ ", Bonus= " +Bonus+ ", Deductions= " +Deductions+ '}'; }

    
 
          
    
   
   
}
