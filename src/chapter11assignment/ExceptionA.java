
package chapter11assignment;


public class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message); 
    }
    
}
class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message); // Pass the message to the parent constructor
    }
}

// ExceptionC inherits from ExceptionB
class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message); // Pass the message to the parent constructor
    }
}