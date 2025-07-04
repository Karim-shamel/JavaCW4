import java.util.Objects;

public class ProcessedApplication extends Application {

    // create a constructor to initialize ProcessedApplication's objects.
    // and a list of methods to get and retrieve ProcessedApplication' information.
    // Including all information about Application,
    // ProcessedApplication usually have the following type of information

    /*
     * Status (Approved or rejected)
     * LoanEstimate
     * 
     * // Define a method to determine status based on the following:
     * // if total debts >= total assets
     * // or total debts/total income > Debt-to-income (DTI) ratio (of the lender)
     * // or if there is any outstanding judgments against borrower
     * //or borrower has been declared bankrupt within the past 7 years.
     * //or borrower had property foreclosed upon or given title or deed in lieu
     * thereof in the last 7 years
     * //or borrower is a party to a lawsuit
     * //or borrower has directly or indirectly been obligated on any loan which
     * resulted in foreclosure, transfer of title in lieu of foreclosure, or
     * judgment.
     * 
     * 
     * // Define a method to create the LoanEstimate (if status is approved) based
     * on
     * // the information of property's price, lender fees, interest rate
     * // otherwise (status is rejected) LoanEstimate attributes will be -1 (a
     * number to declare rejection status)
     */
    String status;
    double loanEstimate;

    public ProcessedApplication(String applicationNumber, Borrower borrower, Lender lender, Property property) {
        super(applicationNumber, borrower, lender, property);
    }

    public String getStatus() {
        if (getTotalLiabilities() >= getTotalAssets()) {
            status = "Rejected";
        } else if (getTotalLiabilities() / getTotalIncome() > getLender().getDTI()) {
            status = "Rejected";
        } else if (borrower.getCreditHistory().bankruptcies > 0) {
            status = "Rejected";
        } else if (borrower.getCreditHistory().getForeclosures() > 0) {
            status = "Rejected";
        } else {
            status = "Approved";
        }
        return status;
    }

    public double getLoanEstimate() {
        if (Objects.equals(getStatus(), "Approved")) {
            loanEstimate = property.getExpectedSalePrice() + lender.getLenderFees() +
                    (lender.getInterestRate() * property.getExpectedSalePrice());
        } else {
            loanEstimate = -1;
        }
        return loanEstimate;
    }

}
