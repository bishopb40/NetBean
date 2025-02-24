
package chapter11assignment;

public class ExceptionA1 extends Exception {
    public ExceptionA(String message){
        super(message);
    }
}


class ExceptionB extends ExceptionA1 {
    public ExceptionB(String message) {
        super(message);
    }
}