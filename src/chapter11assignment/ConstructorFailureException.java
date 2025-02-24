
package chapter11assignment;


public class ConstructorFailureException extends Exception{
    public ConstructorFailureException(String message) {
        super(message);
    }
    
}

class SomeClass {
    public SomeClass() throws ConstructorFailureException {
        // Simulating a failure in the constructor
        boolean constructorFailure = true; // You can change this to simulate failure/success
        
        if (constructorFailure) {
            // Throwing the exception with a message if constructor fails
            throw new ConstructorFailureException("Constructor failed while creating SomeClass object.");
        }
        
        // If no failure, proceed with normal initialization
        System.out.println("SomeClass object created successfully.");
    }
}
