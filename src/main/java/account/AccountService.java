package account;

public class AccountService {

    public void withdraw(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
            Logger.getInstance().log(amount + " has been withdraw from " + accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
            Logger.getInstance().log(amount + " has been deposit into " + accountNumber);
        }
    }
}
