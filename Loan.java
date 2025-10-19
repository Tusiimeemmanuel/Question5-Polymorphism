package evening.loan;

abstract class Loan {
    // Data members
    private String loan_id;
    private String loan_type;
    private double amount;
    private String cust_name;

    // Default constructor
    public Loan() {
        this.amount = 0;
    }

    // Set methods
    public void setLoanId(String loan_id) {
        this.loan_id = loan_id;
    }

    public void setCustomerName(String cust_name) {
        this.cust_name = cust_name;
    }

    // Get methods
    public String getLoanId() {
        return loan_id;
    }

    public String getCustomerName() {
        return cust_name;
    }

    // Set and get loan amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    // Abstract method for loan type
    public abstract String loanType();
}
