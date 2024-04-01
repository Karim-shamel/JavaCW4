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

    public MortgageMarket() {
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
