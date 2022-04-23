package revision.oop;

public abstract class Employee {
    
  //add specfied gender using enum
   enum Gender{male,female}; 
     String Name;
     int SSN;
     String Address;
   Gender Sex;
    
   //Setters & Getters ... You may add "Public" or not
    public void SetName(String Name)
    {  this.Name = Name;  }
    
    public String GetName()
    {  return Name;  }
    
    void SetSSN(int SSN)
    {  this.SSN = SSN;  }      
    
    int GetSSN ()
    {  return SSN;  }        
    
    public void SetAddress(String Address)
    {  this.Address = Address;  }   
    
    public String GetAddress()
    {  return Address;  }
    
    public void setSex(Gender Sex) 
    { this.Sex = Sex;}
       
    public Gender getSex() 
    { return Sex; }
  
   public Employee(String name, String address, int ssn, Gender sex) {
        this.Name = name;
        this.Address = address;
        this.SSN = ssn;
        this.Sex = sex;           }
    
  //abstract
  abstract double Earning();
   
//Method using netbeans to show details and used in sub classes
@Override
public String toString() {
return "Employee{"+"Name= "+Name+ ", SSN ="+SSN+ ", Address= "+Address+ ", Sex= "+Sex+ '}'; }
    
    
    
    
}
