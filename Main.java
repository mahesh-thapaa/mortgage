import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate (%): ");
        double annualInterest = input.nextDouble();

        System.out.print("Period (Years): ");
        int years = input.nextInt();

        // Close scanner to prevent resource leaks
        input.close();

        // Convert annual interest rate to monthly interest rate
        double monthlyInterest = annualInterest / 100 / 12;

        // Convert years to months
        int numberOfPayments = years * 12;

        // Calculate mortgage using the formula
        double mortgage = principal * 
                          (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                          (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Format mortgage amount as currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        // Display result
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
