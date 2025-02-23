
package Chapter9.Inheritance;

public class SalaryEmployee extends Employee{
    private double dailyWage = 500.0;
    
    public SalaryEmployee(String employeeid,String firstName,String lastName,String socialSecurityNumber){
        super (employeeid,firstName,lastName,socialSecurityNumber);
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }
    
    
    public double earnings(){
        return dailyWage * 28;
    }
    @Override public String toString(){
        return super.toString()+String.format("%\n%-15: %.2f", 
                "Daily Wage", dailyWage); 
    }
}
