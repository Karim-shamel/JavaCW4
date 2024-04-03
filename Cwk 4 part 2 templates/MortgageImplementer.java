import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MortgageImplementer implements MLH {
    private List<Borrower> borrowers;
    private List<Property> properties;
    private List<Lender> lenders;

    @Override
    public MortgageMarket initializeMortgageMarket(int numOFBorrowers, int numOFProperties, int numOFLenders) {
        return new MortgageMarket(borrowers, lenders, properties);
    }

    @Override
    public Application apply(Borrower b, Property p, Lender l) {
        String applicationNumber = UUID.randomUUID().toString();
        return new Application(applicationNumber, b, l, p);
    }

    @Override
    public ProcessedApplication process(Application a) {
        return new ProcessedApplication(a.getApplicationNumber(), a.getBorrower(), a.getLender(), a.getProperty());
    }

    @Override
    public ClosedApplication close(ProcessedApplication pa) {
        return new ClosedApplication(pa.getApplicationNumber(), pa.getBorrower(), pa.getLender(), pa.getProperty());
    }
}
