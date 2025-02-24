
package chapter11assignment;


public class ExceptionPropagationDemo {
    public static void someMethod() {
        try {
            // Simulating some operations that could throw an exception
            System.out.println("Inside someMethod's try block");
            
            // This will cause an ArithmeticException (divide by zero)
            int result = 10 / 0;
            
            // This will not be executed because the exception above interrupts the flow
            System.out.println("This message will not be printed.");
            
        } catch (ArithmeticException e) {
            // This exception is caught in someMethod
            System.out.println("Caught ArithmeticException in someMethod: " + e.getMessage());
        }

        // This exception is not caught here and will slip through to the calling method
        System.out.println("someMethod is done.");
    }

    public static void main(String[] args) {
        try {
            // Call someMethod which has its own try block
            someMethod();
            
            // Simulating another operation that could throw an exception
            System.out.println("Now throwing a NullPointerException in main.");
            String str = null;
            str.length();  // This will throw a NullPointerException
            
        } catch (NullPointerException e) {
            // Catching the exception from main
            System.out.println("Caught NullPointerException in main: " + e.getMessage());
        }
    }
    
}
