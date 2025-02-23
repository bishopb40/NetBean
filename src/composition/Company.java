
package composition;
import java.util.List;

public class Company {
    
    String companyName;
    List<Department> department;
    
    public Company(String companyName,List<Department>department){
        this.companyName = companyName;
        this.department = department;
    }
    
    public void diplaycompanyinform(){
        System.out.printf("%s company has %n ", companyName);
        for(Department department: department){
            System.out.printf("%s%n", department.Displaydepartment());
        }
    }
    
}
