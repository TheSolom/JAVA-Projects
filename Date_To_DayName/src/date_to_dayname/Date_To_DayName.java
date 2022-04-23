package date_to_dayname;
import java.util.*;
import java.time.*;
public class Date_To_DayName {

    public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
    int mm = sc.nextInt();
    int dd = sc.nextInt();
    int yy = sc.nextInt();
    
    LocalDate s = LocalDate.of(yy, mm, dd);  // or  LocalDate s = LocalDate.parse("2021-08-09");
    System.out.println(s.getDayOfWeek());
        
    }
    
}
