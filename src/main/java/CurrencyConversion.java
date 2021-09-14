import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter amount you have in euros");
        double amountEuros = sc.nextDouble();
        System.out.println("enter the current conversion rate;");
        double conversion = sc.nextDouble();
        double amountUSD = conversion *amountEuros;
        System.out.println(amountEuros + "euros at an exchange rate of " +conversion + " is");
        System.out.println(amountUSD+ " US dollars");

    }
}
