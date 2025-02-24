
package chapter11assignment;

public class ConstructorExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempting to create an object of SomeClass
            SomeClass obj = new SomeClass();
        } catch (ConstructorFailureException e) {
            // Catching the exception thrown by the constructor
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
