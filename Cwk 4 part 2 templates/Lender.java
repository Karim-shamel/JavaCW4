import java.util.*;

public class Lender {
    // create a constructor to initialize Lender's objects.
    // and a list of methods to get and retrieve Lender' information.
    // Lender usually have the following type of information

    /*
     * Lender Number
     * Debt-to-income (DTI) ratio
     * Down payment requirement
     * Interest rate
     * Lender fees
     * Closing costs
     */

    String lenderNum;
    Float DTI;
    double downPaymentReq;
    float interestRate;
    double lenderFees;
    float closingCost;
    private static List<Lender> lenders = new ArrayList<>();

    public Lender(String lenderNum, Float DTI, double downPaymentReq, float interestRate, double lenderFees,
            float closingCost) {
        this.lenderNum = lenderNum;
        this.DTI = DTI;
        this.downPaymentReq = downPaymentReq;
        this.interestRate = interestRate;
        this.lenderFees = lenderFees;
        this.closingCost = closingCost;
        lenders.add(this);
    }

    public String getLenderNum() {
        return lenderNum;
    }

    public Float getDTI() {
        return DTI;
    }

    public double getDownPaymentReq() {
        return downPaymentReq;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public double getLenderFees() {
        return lenderFees;
    }

    public float getClosingCost() {
        return closingCost;
    }

    public static List<Lender> getLenders() {
        return lenders;
    }
}
