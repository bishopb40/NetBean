
package encapsilation;


public class EncapsulationPractic {
    private String accountNumber;
    private String accountholdername;
    private String bvn;
    private double balance;
    private String accountType;

    
    EncapsulationPractic (){
        accountNumber = "08987656";
        accountholdername = "unkwoan";
        bvn = "8797930839";
        balance = 0.00;
        accountType = "savings";
        
        
    }
    public EncapsulationPractic(String accountNumber,
            String accountholdername,
            String bvn,double balance,
            String accountType){
        this.accountNumber = accountNumber;
        this.accountholdername =accountholdername;
        this.bvn = bvn;
        this.balance= balance;
        this.accountType= accountType;
     }
    
    public EncapsulationPractic(String accountNumber,String accountholdername ){
        this.accountNumber = accountNumber;
        this.accountholdername = accountholdername;
    }
    
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountholdername() {
        return accountholdername;
    }

    public String getBvn() {
        return bvn;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    public void display(){
        System.out.printf("account number: %s%n", getAccountNumber());
        System.out.printf("account holder name: %s%n", getAccountholdername());
        System.out.printf("account bvn: %s%n", getBvn());
        System.out.printf("account balance: %s%n", getBalance());
        System.out.printf("account number: %s%n", getAccountType());
        
        
        
    }
    
}
