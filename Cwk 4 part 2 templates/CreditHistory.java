public class CreditHistory {
    // Create a constructor to initialize credithistory' objects.
    // Create a list of methods to get and retrieve credithistory' informtion.
    // Credithistory usually has the following type of information:
    /*
   • Bankruptcies
   • Collections
   • Foreclosures
   • Delinquencies
    * */

    int bankruptcies;
    double collections;
    double foreclosures;
    double delinquencies;

    public CreditHistory(int bankruptcies, double collections, double foreclosures, double delinquencies) {
        this.bankruptcies = bankruptcies;
        this.collections = collections;
        this.foreclosures = foreclosures;
        this.delinquencies = delinquencies;
    }

    public int getBankruptcies() {
        return bankruptcies;
    }

    public double getCollections() {
        return collections;
    }

    public double getForeclosures() {
        return foreclosures;
    }

    public double getDelinquencies() {
        return delinquencies;
    }
}
