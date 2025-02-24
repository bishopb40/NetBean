
package chapter11assignment;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Simulating throwing an exception of type ExceptionC
            throw new ExceptionC("This is ExceptionC");

        } catch (ExceptionA e) {
            // This catch block will handle exceptions of type ExceptionA, ExceptionB, and ExceptionC
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            // Simulating throwing an exception of type ExceptionB
            throw new ExceptionB("This is ExceptionB");

        } catch (ExceptionA e) {
            // This catch block will handle exceptions of type ExceptionA and ExceptionB
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            // Simulating throwing an exception of type ExceptionA
            throw new ExceptionA("This is ExceptionA");

        } catch (ExceptionA e) {
            // This catch block will handle only ExceptionA
            System.out.println("Caught: " + e.getMessage());
        }
    }
    
}
