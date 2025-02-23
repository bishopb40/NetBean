
package Chapter9.Inheritance;

public class TestEmployee {
    public static void main(String  args[]){
        SalaryEmployee salaryEmployee = new SalaryEmployee("1041","Anthony",
                "Franklin",
                "123 - 45- 6789");
        
        
        System.out.println("Salary Employee Details:");
        System.out.println(salaryEmployee);
        System.out.printf("%-15s: $%.2f%n%n","Earnings",
                salaryEmployee.earnings());
        
        
        commissionEmployee sionnemployee = new commissionEmployee("1001","Alice","Johnson",
        "653-45-6089",1000,          0.1);
        
        System.out.println("Commission Employee Details");
        System.out.println(sionnemployee);
        System.out.printf("%-15s: $%.2f%n%n", "Earnings",
                sionnemployee.earnings());
        
        BasePlusCommissionEmployee basepluscommissionemployee = new BasePlusCommissionEmployee("10001","Alice","Johnson",
                "653-45-6989",900,00,90);
        
        
    }
    
}
