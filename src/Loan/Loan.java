package Loan;

public class Loan {
    private double annualInterestRate =2.5;
    private int numberOfYears = 1;
    private double loanAmount = 1000;
    private java.util.Date loanDate ;



    public Loan(){

    }




    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }




    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }




    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

}
