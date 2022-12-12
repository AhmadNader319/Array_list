package Loan;

import java.util.Scanner;

public class TestLoanClass {
     /** Main method */
     public static void main(String[] args) {
          // Create a Scanner
          Scanner input = new Scanner(System.in);

          Loan loan1 = new Loan();

          // Enter yearly interest rate
          System.out.print("Enter yearly interest rate ");

          loan1.setAnnualInterestRate(input.nextDouble());

          // Enter number of years
          System.out.print("Enter number of years as an integer: ");
          loan1.setNumberOfYears(input.nextInt());

          // Enter loan amount
          System.out.print("Enter loan amount, for example, 120000.95: ");
          loan1.setLoanAmount(input.nextDouble());
          // Create Loan.Loan object


          // Display loan date, monthly payment, and total payment
          System.out.printf("The monthly payment is %.2f\nThe total payment is %.2f\n", loan1.getMonthlyPayment(), loan1.getTotalPayment());
     }
}
