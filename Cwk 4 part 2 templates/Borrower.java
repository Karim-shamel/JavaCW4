import java.util.*;
public class Borrower {
    // create a constructor to initialize Borrower's objects.
    // and a list of methods to get and retrieve Borrower' information.
    // Borrower usually have the following type of information

    /*
    * Borrower's Name
    * Social Security Number (SSN)
    * Home Phone
    * DOB (mm/dd/yyyy)
    * Employment
    * Income
    * Assets
    * Debts
    * Credit history
    * */

    String borrowerName;
    String SSN;
    String HomePhone;
    Date DOB;
    Employment employment;
    Income income;
    Assets assets;
    Debts debts;
    CreditHistory creditHistory;
    private static List<Borrower> borrowers = new ArrayList<>();

    public Borrower(String borrowerName, String SSN, String homePhone, Date DOB, Employment employment, Income income, Assets assets, Debts debts, CreditHistory creditHistory) {
        this.borrowerName = borrowerName;
        this.SSN = SSN;
        this.HomePhone = homePhone;
        this.DOB = DOB;
        this.employment = employment;
        this.income = income;
        this.assets = assets;
        this.debts = debts;
        this.creditHistory = creditHistory;
        borrowers.add(this);
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public String getSSN() {
        return SSN;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public Date getDOB() {
        return DOB;
    }

    public Employment getEmployment() {
        return employment;
    }

    public Income getIncome() {
        return income;
    }

    public Assets getAssets() {
        return assets;
    }

    public Debts getDebts() {
        return debts;
    }

    public CreditHistory getCreditHistory() {
        return creditHistory;
    }

    public static List<Borrower> getBorrowers() {
        return borrowers;
    }
}
