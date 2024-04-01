public class Assets {
    // create a constructor to initialize Assets's objects.
    // and a list of methods to get and retrieve Assets' information.
    // Assets usually have the following type of information
    /*
    • Bank accounts (savings, checking, brokerage accounts)
   • Real property
   • Investments (stocks, bonds, retirement accounts)
   • Proceeds from the sale of your current home
   • Gifted funds from relatives (e.g. a down payment gift for an FHA loan)
*/

    BankAccount bankAccounts;
    double realEstate;
    double investments;
    double proceeds;
    double gifted;

    public Assets(BankAccount bankAccounts, double realEstate, double investments, double proceeds, double gifted, Borrower borrower) {
        this.bankAccounts = bankAccounts;
        this.realEstate = realEstate;
        this.investments = investments;
        this.proceeds = proceeds;
        this.gifted = gifted;
    }

    public BankAccount getBankAccounts() {
        return bankAccounts;
    }

    public double getRealEstate() {
        return realEstate;
    }

    public double getInvestments() {
        return investments;
    }

    public double getProceeds() {
        return proceeds;
    }

    public double getGifted() {
        return gifted;
    }
}
