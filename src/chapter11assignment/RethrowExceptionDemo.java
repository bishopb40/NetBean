
package chapter11assignment;

public class RethrowExceptionDemo {
    public static void someMethod2() throws Exception {
        // Simulate an exception being thrown
        throw new Exception("Exception thrown from someMethod2");
    }

    // Method someMethod that calls someMethod2, catches the exception, and rethrows it
    public static void someMethod() throws Exception {
        try {
            // Call someMethod2 which throws an exception
            someMethod2();
        } catch (Exception e) {
            // Catch the exception and rethrow it
            System.out.println("Exception caught in someMethod, rethrowing it...");
            throw e; // Rethrow the caught exception
        }
    }

    // Main method that calls someMethod and catches the rethrown exception
    public static void main(String[] args) {
        try {
            // Call someMethod which will rethrow the exception from someMethod2
            someMethod();
        } catch (Exception e) {
            // Catch the rethrown exception and print the stack trace
            System.out.println("Caught exception in main:");
            e.printStackTrace(); // Print the stack trace of the rethrown exception
        }
    }
    
}
