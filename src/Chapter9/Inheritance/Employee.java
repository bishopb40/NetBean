
package Chapter9.Inheritance;

public class Employee {
    private final String employeeId;  
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;  

    // Constructor with corrected parameter name
    public Employee(String employeeId, String firstName, String lastName, String socialSecurityNumber) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;  // Fixed: Corrected assignment
    }

    // Getter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for socialSecurityNumber (No setter since it's final)
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Fixed @Override annotation
    @Override
    public String toString() {
        return String.format("%-5s: %s-25s%n%-15s: %-25s%n%-15s: %-25s",
                "Employee ID",employeeId,
                "Full Name ",firstName + " " + lastName,
                "Social Security Number", socialSecurityNumber); 
    }
}
