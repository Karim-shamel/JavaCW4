import java.util.Date;

public class ClosingDisclosure {

    // create a constructor to initialize ClosingDisclosure's objects.
    // and a list of methods to get and retrieve ClosingDisclosure's information.
    // ClosingDisclosure usually have the following type of information

    /*
     * Loan_ID
     * Closing_Date
     * ClosingCosts (Average closing costs for the buyer run between about 2% and 6%
     * of the loan amount. )
     */

    // Define methods to calculate ClosingCosts based on the loan amount
    String loanID;
    Date closingDate;
    double closingCost;

    public ClosingDisclosure(String loanID, Date closingDate, double closingCost) {
        this.loanID = loanID;
        this.closingDate = closingDate;
        this.closingCost = closingCost;
    }

    public String getLoanID() {
        return loanID;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public double getClosingCost() {
        return closingCost;
    }
}
