package evening.loan;

public class LoanApp {
    public static void main(String[] args) {
        // Create CarLoan object
        CarLoan carLoan1 = new CarLoan();

        // Assign values
        carLoan1.setLoanId("CL1001");
        carLoan1.setCustomerName("John Doe");
        carLoan1.setAmount(15000000);
        carLoan1.setCarLien("Toyota Mark X");

        // Display values
        System.out.println("----- Car Loan Details -----");
        System.out.println("Loan ID: " + carLoan1.getLoanId());
        System.out.println("Customer Name: " + carLoan1.getCustomerName());
        System.out.println("Loan Type: " + carLoan1.loanType());
        System.out.println("Loan Amount: " + carLoan1.getAmount());
        System.out.println("Car Lien: " + carLoan1.getCarLien());
    }
}

