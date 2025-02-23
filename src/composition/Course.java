
package composition;
import java.util.List;

public class Course {
    String courseName;
    List<Student>students;
    
    
    public Course(String courseName,List<Student>students){
        this.courseName = courseName;
        this.students = students;
        
    }
    public String displayCourse(){
        return courseName;  
    }
}
