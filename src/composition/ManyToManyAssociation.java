
package composition;
import java.util.List;
public class ManyToManyAssociation {
    public static void main(String args[]){
        Course en = new Course("English");
        Course ma = new Course("Math");
        Course arg = new Course("agric");

        
        Student na = new Student("john");
        Student jh = new Student("emma");
        Student em = new Student("bishop");
        
        List<Course>courses = List.of(en,ma,arg);
        List<Student>students = List.of(na,jh,em);
        
        
        
       

        
    }
    
}
