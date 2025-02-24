
package chapter11assignment;

import java.io.IOException;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        // Throwing ExceptionA and catching it with catch(Exception e)
        try {
            throw new ExceptionA1("This is ExceptionA");
        } catch (Exception exception) {
            System.out.println("Caught: " + exception.getMessage());
        }

        // Throwing ExceptionB (which is a subclass of ExceptionA) and catching it with catch(Exception e)
        try {
            throw new ExceptionB("This is ExceptionB");
        } catch (Exception exception) {
            System.out.println("Caught: " + exception.getMessage());
        }

        // Throwing a NullPointerException and catching it with catch(Exception e)
        try {
            throw new NullPointerException("This is a NullPointerException");
        } catch (Exception exception) {
            System.out.println("Caught: " + exception.getMessage());
        }

        // Throwing an IOException and catching it with catch(Exception e)
        try {
            throw new IOException("This is an IOException");
        } catch (Exception exception) {
            System.out.println("Caught: " + exception.getMessage());
        }
    }
    
}
