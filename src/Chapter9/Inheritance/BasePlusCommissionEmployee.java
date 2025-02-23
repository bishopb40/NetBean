
package Chapter9.Inheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    // Constructor with fixed syntax errors
    public BasePlusCommissionEmployee(String employeeId, String firstName, String lastName, 
                                      String socialSecurityNumber, double grossSale, 
                                      double commissionRate, double baseSalary) { // ✅ Fixed missing comma
        super(employeeId, firstName, lastName, socialSecurityNumber, grossSale, commissionRate);

        if (baseSalary <= 0.0) { // ✅ Logic is correct
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // Getter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    // Setter for baseSalary with validation
    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0.0) {
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // Overridden earnings method
    @Override public double earnings() {
        return baseSalary + super.earnings();
    }

    // Overridden toString method
    @Override public String toString() {
        return super.toString() + String.format("\n%s: %.2f", "Base Salary", baseSalary);
    }
}

    
}
