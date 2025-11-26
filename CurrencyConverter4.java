import java.util.*;

public class CurrencyConverter4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- Currency Converter ----");
        System.out.print("Enter amount in INR: ");
        double amount = sc.nextDouble();

        double usd = amount / 83;
        double euro = amount / 90;
        double yen = amount / 0.55;

        System.out.println("USD: $" + usd);
        System.out.println("EURO: €" + euro);
        System.out.println("YEN: ¥" + yen);
    }
}
