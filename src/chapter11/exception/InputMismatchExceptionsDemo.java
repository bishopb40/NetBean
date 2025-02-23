
package chapter11.exception;
import java.util.Scanner;
import java.util.InputMismatchException;
public class InputMismatchExceptionsDemo {
    public static void main(String args[]){
        
        int num;
        Scanner scan =  new Scanner(System.in);
        
        while(true){
        try{
        System.out.print("enter a number: ");
        num = scan.nextInt();
        break;
        }
        catch(InputMismatchException e){
            scan.nextLine();
            System.out.println("invalid input, please provide a valid integer");
        }
        }
        
     
    System.out.printf("%d is a valid integer %n", num);
    }
    
}
