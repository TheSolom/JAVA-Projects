package revision;

public class Revision {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Department d1= new Department(1,"Information Systems");
        
        SalariedEmployee se = new SalariedEmployee(2000, 500, 50, "Ahmed", "Riyadh", 1200, Gender.male);
       
        d1.add_employee(se);
        
        HourlyEmployee he = new HourlyEmployee(100, 6, "Mohamed","Kharj", 1500, Gender.male);
        
        d1.add_employee(he);
        
        Commission_Employee ce = new Commission_Employee(15000, 0.25, "Fatema", "Riyadh", 1200, Gender.female);
        
        d1.add_employee(ce);
        
       System.out.println( d1.getemployeecount());
       
     //  d1.print_basic_data();
       
      d1.print_All_details();
        
    }
    
}
