public class Application {
    // create a constructor to initialize Application's objects.
    // and a list of methods to get and retrieve Application' information.
    // Application usually have the following type of information
//

    /*
* Application Number
* Borrower
* Lender
* Property
* Total Assets
* Total Liabilities
     * */

    // Define methods to calculate total assets and total liabilities
    // based on the information of borrower's assets and debts
    String applicationNumber;
    Borrower borrower;
    Lender lender;
    Property property;
    double totalAssets;
    double totalLiabilities;

    public Application(String applicationNumber, Borrower borrower, Lender lender, Property property) {
        this.applicationNumber = applicationNumber;
        this.borrower = borrower;
        this.lender = lender;
        this.property = property;
        setTotalAssets();
        setTotalLiabilities();
    }

    public void setTotalAssets() {
        this.totalAssets = borrower.getAssets().getBankAccounts().getCurrentBalance()+borrower.getAssets().getRealEstate()+borrower.getAssets().getInvestments()+borrower.getAssets().getProceeds()+borrower.getAssets().getGifted();
    }

    public void setTotalLiabilities() {
        this.totalLiabilities = borrower.getDebts().getCurrentMortgage()+borrower.getDebts().getLiens()+borrower.getDebts().getAlimony()+borrower.getDebts().getChildSupport()+borrower.getDebts().getCarLoans()+borrower.getDebts().getCreditCards()+borrower.getDebts().getRealEstateTaxes()+borrower.getDebts().getHazardInsurance()+borrower.getDebts().getHOAFees();
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Lender getLender() {
        return lender;
    }

    public Property getProperty() {
        return property;
    }

    public double getTotalAssets() {
        return totalAssets;
    }

    public double getTotalLiabilities() {
        return totalLiabilities;
    }
    public double getTotalIncome(){
        return borrower.getIncome().getTotalIncome();
    }
}
