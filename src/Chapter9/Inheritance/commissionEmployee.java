
package Chapter9.Inheritance;


public class commissionEmployee extends Employee{
    private double grossSale;
    private double commissionRate;
    
    
    public commissionEmployee(String employeeId,String firstName,String lastName,String socialSecurityNumber,
            double grossSale,double commissionRate){
        super(employeeId,firstName,lastName,socialSecurityNumber);
        
        if(grossSale <0.0){
            throw new IllegalArgumentException("Gross sale must be >=0.0");
        }
        if (commissionRate <=0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission Rate must be >0.0 and < 1.0");
        }
        
        this.grossSale =  grossSale;
        this.commissionRate = commissionRate;
    }
    public double getGrossSale(){
        return grossSale;
    }
    public void setGrossSale(double grossSale){
        if (grossSale <0.0)
            throw new IllegalArgumentException("Gross Sale must be >= 0.0");
        this.grossSale = grossSale;
    }
    public double getCommisssionRate(){
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate){
        if (commissionRate <= 0.0 ||commissionRate >= 1.0)
            throw new IllegalArgumentException("commission rate must be >0.0 and < 1.o");
        this.commissionRate =commissionRate;
        
    }
    public double earnings(){
        return grossSale * commissionRate;
    }
    
    @Override 
    public String toString(){
        return super.toString() + String.format("%n%-15:%-10.2f%n%-15s: %-10.25f",
                "Gross Sale", grossSale,
                "Commsission Rate", commissionRate);
    }
}
