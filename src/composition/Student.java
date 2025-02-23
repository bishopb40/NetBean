
package composition;

import java.util.List;
public class Student {
    
    String name ;
    List<Course> courses;
    
    public Student(String name, List<Course>courses){
        this.name =  name;
        this.courses = courses;
    }
    public void diplaystudentinform(){
        System.out.printf("%s enrrolled in the follow courses %n",name);
        for(Course course :courses ){
            System.out.printf("%s", course.displayCourse());
        }
    }
}
