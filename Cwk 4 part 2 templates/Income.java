public class Income {
    // Create a constructor to initialize Income's objects.
    // and create a list of methods to retrieve and get Income's information.
    // Income usually contains the following type of information:

    /*
     *
     * Base Employment Income
     * Overtime
     * Bonuses
     * Commissions
     * Dividends/Interest
     * Net Rental Income
     * Other
     */

    double baseIncome;
    double overtime;
    double bonuses;
    double commissions;
    double dividends;
    double netRentalIncome;
    double other;

    public Income(double baseIncome, double overtime, double bonuses, double commissions, double dividends,
            double netRentalIncome, double other) {
        this.baseIncome = baseIncome;
        this.overtime = overtime;
        this.bonuses = bonuses;
        this.commissions = commissions;
        this.dividends = dividends;
        this.netRentalIncome = netRentalIncome;
        this.other = other;
    }

    public double getBaseIncome() {
        return baseIncome;
    }

    public double getOvertime() {
        return overtime;
    }

    public double getBonuses() {
        return bonuses;
    }

    public double getCommissions() {
        return commissions;
    }

    public double getDividends() {
        return dividends;
    }

    public double getNetRentalIncome() {
        return netRentalIncome;
    }

    public double getOther() {
        return other;
    }

    public double getTotalIncome() {
        return getBaseIncome() + getOvertime() + getCommissions() + getBonuses() + getDividends() + getNetRentalIncome()
                + getOther();
    }
}
