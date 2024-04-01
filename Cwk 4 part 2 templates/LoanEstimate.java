public class LoanEstimate {
    // create a constructor to initialize LoanEstimate's objects.
    // and a list of methods to get and retrieve LoanEstimate's information.
    // LoanEstimate usually have the following type of information

    /*
    Applicant_Name (the Borrower's name)
    Loan_amount
    Loan_Term
    Interest_rate
    Monthly_Principal_AND_Interest
    Mortgage_Insurance
    Estimated_Escrow
    Estimated_Total_Monthly_Payment (Monthly_Principal_AND_Interest + Mortgage_Insurance + Estimated_Escrow)
    * */

    // Define a method that calculates the Estimated_Total_Monthly_Payment based on the information
    // of Loan_amount, Loan_Term, Interest_rate

    Borrower applicantName;
    double loanAmount;
    float loanTerm;
    float interest;
    double MPAI;
    double mortgageInsurance;
    double estimatedEscrow;
    double estimatedMonthlyPayment;

    public LoanEstimate(Borrower applicantName, double loanAmount, float loanTerm, float interest, double MPAI, double mortgageInsurance, double estimatedEscrow) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.interest = interest;
        this.MPAI = MPAI;
        this.mortgageInsurance = mortgageInsurance;
        this.estimatedEscrow = estimatedEscrow;
    }

    public Borrower getApplicantName() {
        return applicantName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public float getLoanTerm() {
        return loanTerm;
    }

    public float getInterest() {
        return interest;
    }

    public double getMPAI() {
        return MPAI;
    }

    public double getMortgageInsurance() {
        return mortgageInsurance;
    }

    public double getEstimatedEscrow() {
        return estimatedEscrow;
    }

    public double getEstimatedMonthlyPayment() {
        return estimatedMonthlyPayment;
    }

    public void setEstimatedMonthlyPayment() {
        this.estimatedMonthlyPayment = getMPAI() + getEstimatedEscrow() + getMortgageInsurance();
    }
}
