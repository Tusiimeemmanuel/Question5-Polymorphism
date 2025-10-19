package evening.loan;

class CarLoan extends Loan {
    // Variable for car lien
    private String car_lien;

    // No-arg constructor
    public CarLoan() {
        setAmount(0);
        setLoanId("");
        setCustomerName("");
    }

    // Set lien value
    public void setCarLien(String lien) {
        this.car_lien = lien;
    }

    // Get lien value
    public String getCarLien() {
        return car_lien;
    }

    // Implement abstract method
    @Override
    public String loanType() {
        return "Car Loan";
    }
}
