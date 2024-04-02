import java.util.*;
public class MortgageMarket {
    // Create a constructor to initialize MortgageMarket' objects.
    // Create a list of methods to get and retrieve MortgageMarket's information.
    // MortgageMarket usually has the following type of information:

    /*
    * Borrowers
    * Lenders
    * Properties
    * */
    List<Borrower> borrowers = Borrower.getBorrowers();
    List<Lender> lenders = Lender.getLenders();
    List<Property> properties = Property.getProperties();

    public MortgageMarket(List<Borrower> borrowers, List<Lender> lenders, List<Property> properties) {
        this.borrowers = borrowers;
        this.lenders = lenders;
        this.properties = properties;
    }

    public List<Borrower> getBorrowers() {
        return borrowers;
    }

    public List<Lender> getLenders() {
        return lenders;
    }

    public List<Property> getProperties() {
        return properties;
    }
}
