
package date_and_time;
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String args[]){
    LocalTime localTime =LocalTime.now();
    
    System.out.println(localTime);
    
    LocalTime appointmentTime = LocalTime.of(1, 30);
    System.out.println(appointmentTime);
    
    
    LocalTime appointmentTime1 = LocalTime.of(1, 30,8);
    System.out.println(appointmentTime1);
    
    LocalTime appointmentTime2 = LocalTime.of(1, 30,8,9);
    System.out.println(appointmentTime2);

    
    LocalTime userTime = LocalTime.parse("18:47:34");
    System.out.println(userTime);
    
    
    int hour = userTime.getHour();
    System.out.println(hour);
    
    int minute = userTime.getMinute();
    System.out.println(minute);
    
    int second = userTime.getSecond();
    System.out.println(second);
    
    int nano = userTime.getNano();
    System.out.println(nano);
    
    LocalTime addHours = userTime.plusHours(5);
    System.out.println(addHours);
    
    LocalTime addminute = userTime.plusMinutes(4);
    System.out.println(addminute);
    
    LocalTime addsecond = userTime.plusSeconds(7);
    System.out.println(addsecond);
    
    boolean isBefore = LocalTime.now().isBefore(LocalTime.of(12, 0));
    System.out.println(isBefore);
    
    boolean isAfter = LocalTime.now().isAfter(LocalTime.of(12, 0));
    System.out.println(isAfter);
    
    String meetingTime1 = "12:55:52";
    String meetingTime2 = "06:12:32";
    
    LocalTime time1 = LocalTime.parse(meetingTime1);
    LocalTime time2 = LocalTime.parse(meetingTime2);
    
    boolean isTimeEqual = time1.equals(time2);
    
    System.out.println(isTimeEqual);
    }
}
