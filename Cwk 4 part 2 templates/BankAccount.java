import java.util.Date;

public class BankAccount {
    // create a constructor to initialize BankAccount's objects.
    // and a list of methods to get and retrieve BankAccount' information.
    // BankAccount usually have the following type of information
    /*
     * • Account number
     * • Account type, such as a checking, savings, individual retirement account
     * (IRA), or certificate of deposit (CD)
     * • Open or closed status and open date
     * • Account holder names, which are the authorized signers on the account.
     * • Balance information, including current balance as well as average balance
     * history over the last two statement periods.
     * • Current interest rate (if applicable) as well as interest paid over the two
     * most recent statement periods.
     * • Account closed date and the balance at the close (if applicable)
     */

    String accountNum;
    String accountType;
    String holderNames;
    double currentBalance;
    double avgBalance;
    float currentInterest;
    Date accountCloseDate;

    public BankAccount(String accountNum, String accountType, String holderNames, double currentBalance,
            double avgBalance, float currentInterest, Date accountCloseDate) {
        this.accountNum = accountNum;
        this.accountType = accountType;
        this.holderNames = holderNames;
        this.currentBalance = currentBalance;
        this.avgBalance = avgBalance;
        this.currentInterest = currentInterest;
        this.accountCloseDate = accountCloseDate;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getHolderNames() {
        return holderNames;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getAvgBalance() {
        return avgBalance;
    }

    public float getCurrentInterest() {
        return currentInterest;
    }

    public Date getAccountCloseDate() {
        return accountCloseDate;
    }
}
