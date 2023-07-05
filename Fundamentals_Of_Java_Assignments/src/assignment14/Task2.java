package assignment14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the amount that you want to convert: ");
            double rsd = input.nextDouble();
            input.nextLine();
            System.out.println("Enter the currency you want to convert money to(GBP,USD ili EUR): ");
            String currency1 = input.nextLine().trim().toUpperCase();

            System.out.println("The amount after currency change is: " + currencyExchange(rsd,currency1));
            System.out.println("The amount after currency change is: " + currencyExchange(300, "eur".toUpperCase().trim()));
            System.out.println("The amount after currency change is:  " + currencyExchange(400,"KM".toUpperCase().trim()));
            System.out.println("The amount after currency change is: " + currencyExchange(-200,"eur".toUpperCase().trim()));

        }

        public static double currencyExchange(double amount, String currency )
        {if(amount>=0)
            switch (currency) {
                case "EUR":
                    return amount / 118.50;
                case "USD":
                    return amount / 105.71;
                case "GBP":
                    return amount / 133.60;
                default:
                    System.out.println("The calculator does not support the specified currency! ");
                    return 0.0;
            }
        else{
            System.out.println("Invalid data input!");
            return 0.0;
        }

    }
}
