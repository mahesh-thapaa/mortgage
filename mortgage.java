import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        int principal = input.nextInt();

        System.out.println("Annual Intrest Rate: ");
        double annualintrest  = input.nextFloat();
        double monthlyInterst =  annualintrest/PERCENT/MONTHS_IN_YEAR;

        System.out.println("Period (Years)");
        byte years = input.nextByte();
        int numbers0fPayments = years*MONTHS_IN_YEAR;
        double mortgage = principal *
                (monthlyInterst * Math.pow(1 + monthlyInterst, numbers0fPayments)) /
                (Math.pow(1 + monthlyInterst, numbers0fPayments) - 1);


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage is:"+mortgageFormatted);
    }
}
