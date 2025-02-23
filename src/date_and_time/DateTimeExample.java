
package date_and_time;
import java.time.LocalDateTime;
import java.time.Month;
public class DateTimeExample {
   public static void main(String args[]){
       LocalDateTime todayDateTime = LocalDateTime.now();
       System.out.printf("%s%n",todayDateTime);
       
       LocalDateTime appointmentDateTime = LocalDateTime.of(2000, Month.MAY,
               12, 12, 20);
       
       System.out.printf("%s%n", appointmentDateTime);
       
       String userDateTime = "2025-02-06T14:30:00";
       System.out.printf("%s%n",userDateTime);
       
       
   }
    
}
