package account;

public class TransferService {
    public void transfer(final String accountNumberSource,final String accountNumberDestination, double ammount) {
        if(ammount>0 && AccountNumberValidator.validate(accountNumberSource)
                && AccountNumberValidator.validate(accountNumberDestination)) {
            Logger.getInstance().log("money from " + accountNumberSource + " to " + accountNumberDestination + " has been transferred ...");

        }
    }
}
