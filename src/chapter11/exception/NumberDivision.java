
package chapter11.exception;
import java.util.Scanner;

public class NumberDivision {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int divide ;
        System.out.print("enter a number: ");
      
        int  num = scan.nextInt();
        
        System.out.print("enter second number: ");
      
        int  num1 = scan.nextInt();
        
        try{
        divide = num/num1;
        
        System.out.println(divide);
        }
        
        catch(ArithmeticException e){
            System.out.println("errow: num cannot be divided by zero");
            
        }
        
        finally{
        if(num>num1){
            System.out.printf("%d is greater than %d%n ",num,num1);
           }
        else{
            System.out.printf("%d is not greater than %d%n  ",num1);
            
        }
        }
        }
    }
    

