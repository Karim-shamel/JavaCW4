import java.util.Date;

public class ClosedApplication extends ProcessedApplication{
    // create a constructor to initialize ClosedApplication's objects.
    // and a list of methods to get and retrieve ClosedApplication' information.
    // Including all information about ProcessedApplication,
    // ClosedApplication usually have the following type of information

/*
*
*  ClosingDisclosure
* */

// define a method to create a closing disclosure
    String loanID = "123456";
    Date closingDate = new Date();
    double closingCost = 5000.0;

    ClosingDisclosure closingDisclosure = new ClosingDisclosure(loanID, closingDate, closingCost);

    public ClosedApplication(String applicationNumber, Borrower borrower, Lender lender, Property property) {
        super(applicationNumber, borrower, lender, property);
    }

    public ClosingDisclosure getClosingDisclosure() {
        return closingDisclosure;
    }
}

