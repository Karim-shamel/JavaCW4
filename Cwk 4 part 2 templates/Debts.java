public class Debts {
   // create a constructor to initialize debts's objects.
   // and a list of methods to get and retrieve debts' information.
   // Debts usually have the following type of information


    /*
   • Current mortgage
   • Liens
   • Alimony
   • Child support
   • Car loans
   • Credit cards
   * Real Estate Taxes
   * Homeowner Assn. Dues
   * Hazard Insurance

    *
    * */

    double currentMortgage;
    double liens;
    double alimony;
    double childSupport;
    double carLoans;
    double creditCards;
    double realEstateTaxes;
    double HOAFees;
    double hazardInsurance;

    public Debts(double currentMortgage, double liens, double alimony, double childSupport, double carLoans, double creditCards, double realEstateTaxes, double HOAFees, double hazardInsurance) {
        this.currentMortgage = currentMortgage;
        this.liens = liens;
        this.alimony = alimony;
        this.childSupport = childSupport;
        this.carLoans = carLoans;
        this.creditCards = creditCards;
        this.realEstateTaxes = realEstateTaxes;
        this.HOAFees = HOAFees;
        this.hazardInsurance = hazardInsurance;
    }

    public double getCurrentMortgage() {
        return currentMortgage;
    }

    public double getLiens() {
        return liens;
    }

    public double getAlimony() {
        return alimony;
    }

    public double getChildSupport() {
        return childSupport;
    }

    public double getCarLoans() {
        return carLoans;
    }

    public double getCreditCards() {
        return creditCards;
    }

    public double getRealEstateTaxes() {
        return realEstateTaxes;
    }

    public double getHOAFees() {
        return HOAFees;
    }

    public double getHazardInsurance() {
        return hazardInsurance;
    }
}
