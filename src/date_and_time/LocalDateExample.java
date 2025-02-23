
package date_and_time;
import java.time.LocalDate;
import java.time.Month;


public class LocalDateExample {
    public static void main(String args[]){
        LocalDate todayDate = LocalDate.now();
        
        System.out.println(todayDate);
        
        String dob = "2000-06-20";
        LocalDate birthDate = LocalDate.parse(dob);
        System.out.println(birthDate);
        
        LocalDate date = LocalDate.of(2025, 4, 6);
        System.out.println(date);
        
      
        int birthYear = LocalDate.parse(dob).getYear();
        System.out.printf("Your Birth Year is %d%n",birthYear);
        
        Month birthMonth = LocalDate.parse(dob).getMonth();
        System.out.printf("Your Birth Month is %s%n",birthMonth);
        
        int birthDay = LocalDate.parse(dob).getDayOfMonth();
        System.out.printf("Your Birth Day is %d%n",birthDay);
        
        
    }    
}
