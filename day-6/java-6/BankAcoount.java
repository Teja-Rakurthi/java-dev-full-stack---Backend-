class InvalidFundsException extends Exception{
    InvalidFundsException(String message){
        super(message);
    }
}
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
class Bank{
    private String accholder;
    private double balance;
    Bank(String accholder,double balance){
        this.accholder=accholder;
        this.balance=balance;
    }
    void deposit(double amount) throws InvalidFundsException{
    if(amount<=0){
        throw new InvalidFundsException("Amount must be positive");
    }
    balance+=amount;
        System.out.println(accholder + " deposit: " + amount);
    }
    void withdraw(double amount)throws InvalidFundsException , InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Exceeds balance");
        }
        if(amount<=0){
            throw new InvalidFundsException("Amount must be positive");
        }
        balance-=amount;
        System.out.println(accholder + " withdrew: " + amount);
    }
    void Showbalance(){
        System.out.println(accholder+" balance= "+balance);
    }


}
public class BankAcoount {
    public static void main(String[] args){
        Bank acc1= new Bank("Teja",50000);
        Bank acc2=new Bank("ChintuAunty",100000);
        Bank acc3=new Bank("Bangaram",10000);
    try{
        acc1.deposit(1000);
        acc1.withdraw(1000);
        acc2.deposit(2000);
        acc3.deposit(-300);

    }catch (InvalidFundsException | InsufficientFundsException e){
        System.out.println("Error"+ e.getMessage());
    }
    acc1.Showbalance();
    acc2.Showbalance();
    acc3.Showbalance();
    }
}