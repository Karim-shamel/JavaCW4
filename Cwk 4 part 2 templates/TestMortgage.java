import java.sql.Date;
import java.util.Calendar;

/**
 * The TestMortgage class is used to test the functionality of the
 * MortgageImplementer class.
 * It creates instances of various classes such as Borrower, Lender, Property,
 * Application, and ProcessedApplication,
 * and performs operations such as initializing the mortgage market, processing
 * applications, and closing applications.
 * The main method contains the test code.
 */
class TestMortgage {
    public static void main(String[] args) {
        // Initialize the mortgage market with one borrower, one property, and two
        // lenders
        MortgageImplementer mortgagemarket = new MortgageImplementer();
        mortgagemarket.initializeMortgageMarket(1, 1, 2);

        // Create dates for the borrower's birth and bank account opening
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1990, 11, 12);
        Date date1 = new Date(calendar1.getTime().getTime());

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2000, 1, 2);
        Date date2 = new Date(calendar2.getTime().getTime());

        // Create employment and income details for the borrower
        Employment employment = new Employment("Hassan", "20-0101-157-8876", "Wall Street", "8 Hours", "Bank Manager",
                10000);
        Income income = new Income(5000, 200, 300, 100, 0, 2000, 0);

        // Create a bank account and assets for the borrower
        BankAccount bankAccount = new BankAccount("1", "current account", "John", 200000.0, 100000.0, 1.0f, date2);
        Assets assets = new Assets(bankAccount, 10, 20, 50, 200, null);

        // Create debts and credit history for the borrower
        Debts debts = new Debts(100, 200, 300, 400, 500, 600, 700, 800, 900);
        CreditHistory creditHistory = new CreditHistory(3, 2, 4, 7);

        // Create the borrower
        Borrower borrower = new Borrower("John", "1943-8763-7661", "20-0100-155-9976", date1, employment, income,
                assets, debts, creditHistory);

        // Create two lenders
        Lender lender1 = new Lender("1", 2.8f, 9.1, 6f, 2000, 500);
        Lender lender2 = new Lender("2", 1.59f, 7.6, 4f, 2000, 500);

        // Create a property
        Property property = new Property("Wall Street", 100000, "ranch-style house", 200, 500, 200);

        // Create two applications, one for each lender
        Application application1 = new Application("1", borrower, lender1, property);
        Application application2 = new Application("2", borrower, lender2, property);

        // Process the applications
        ProcessedApplication processedApplication1 = mortgagemarket.process(application1);
        ProcessedApplication processedApplication2 = mortgagemarket.process(application2);

        // Compare the loan costs and close the application with the lowest cost
        if (processedApplication1.getLoanEstimate() < processedApplication2.getLoanEstimate()) {
            mortgagemarket.close(processedApplication1);
        } else {
            mortgagemarket.close(processedApplication2);
        }

        // Print the status of the applications
        System.out.println(processedApplication1.getStatus());
        System.out.println(processedApplication2.getStatus());

        // Create employment and income details for the borrower
        Employment employment_ = new Employment("Grant", "20-0101-157-8876", "Wall Street", "8 Hours", "Bank Manager",
                10000);
        Income income_ = new Income(10000, 200, 300, 100, 0, 2000, 0); // Increase the income

        // Create a bank account and assets for the borrower
        BankAccount bankAccount_ = new BankAccount("1", "current account", "John", 200000.0, 100000.0, 1.0f, date2);
        Assets assets_ = new Assets(bankAccount_, 10000, 20000, 50000, 200000, null); // Increase the assets

        // Create debts and credit history for the borrower
        Debts debts_ = new Debts(100, 200, 300, 400, 500, 600, 700, 800, 900);
        CreditHistory creditHistory_ = new CreditHistory(0, 0, 0, 0); // No bankruptcies or foreclosures

        // Create the borrower
        Borrower borrower_ = new Borrower("Emily", "1943-8763-7661", "20-0100-155-9976", date1, employment_, income_,
                assets_, debts_, creditHistory_);

        // Create two lenders
        Lender lender1_ = new Lender("1", 2.8f, 9.1, 6f, 2000, 500);
        Lender lender2_ = new Lender("2", 1.59f, 7.6, 4f, 2000, 500);

        // Create a property
        Property property_ = new Property("Wall Street", 100000, "ranch-style house", 200, 500, 200);

        // Create two applications, one for each lender
        Application application1_ = new Application("1", borrower_, lender1_, property_);
        Application application2_ = new Application("2", borrower_, lender2_, property_);

        // Process the applications
        ProcessedApplication processedApplication1_ = mortgagemarket.process(application1_);
        ProcessedApplication processedApplication2_ = mortgagemarket.process(application2_);

        // Compare the loan costs and close the application with the lowest cost
        if (processedApplication1_.getLoanEstimate() < processedApplication2_.getLoanEstimate()) {
            mortgagemarket.close(processedApplication1_);
        } else {
            mortgagemarket.close(processedApplication2_);
        }

        // Print the status of the applications
        System.out.println(processedApplication1_.getStatus());
        System.out.println(processedApplication2_.getStatus());

    }

}