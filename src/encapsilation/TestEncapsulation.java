
package encapsilation;
import java.util.Scanner;
public class TestEncapsulation {
    public static void main(String arg[]){
        /*Scanner scan = new Scanner(System.in);
        
        System.out.print("enter account number: ");
        String accountNumber = scan.nextLine();
        
        System.out.print("enter account accountholdername: ");
        String accountholdername = scan.nextLine();
        
        System.out.print("enter bvn: ");
        String bvn = scan.nextLine();
        
        System.out.print("enter balance: ");
        double balance = scan.nextDouble();
        
        scan.nextLine();
        
        System.out.print("enter account type: ");
        String accountType = scan.nextLine();
        
        System.out.println("====================");
        System.out.println("");*/
        
        
        
        //EncapsulationPractic encap = new EncapsulationPractic(accountNumber,
        //accountholdername,bvn,balance,accountType);
        EncapsulationPractic encap = new EncapsulationPractic("8735409854","john emma");
        
        encap.display();
        
        System.out.println("");
        EncapsulationPractic encap1 = new EncapsulationPractic("9035409854","bishop emma");
        encap1.display();
        
        System.out.println(""); 
        EncapsulationPractic encap2 = new EncapsulationPractic("90354768854","bishop brown");
        encap2.display();
    }
}
