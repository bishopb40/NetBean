
package composition;
import java.util.List;

public class OneToManyAssociation {
    public static void main(String args[]){
        
        Department hr = new Department("human resources");
        Department systemAdim = new Department("System Adim");
        Department finance  = new Department("finance");
        Department rd = new Department("Research and Development");
        
        List<Department> departments = List.of(hr,systemAdim,finance,rd);
        
        Company comp = new Company("NIIT",departments);
        
        comp.diplaycompanyinform();
    }
    
}
