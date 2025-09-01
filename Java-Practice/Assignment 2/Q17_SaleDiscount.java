import java.util.Scanner;

public class Q17_SaleDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter quantity and rate for item " + i + ": ");
            int qty = sc.nextInt();
            double rate = sc.nextDouble();
            total += qty * rate;
        }

        double discount;
        if (total > 10000)
            discount = total * 0.20;
        else if (total >= 5000)
            discount = total * 0.15;
        else if (total >= 2000)
            discount = total * 0.08;
        else
            discount = 0;

        System.out.println("Total Amount = " + total);
        System.out.println("Discount = " + discount);
        System.out.println("Net Amount = " + (total - discount));
    }
}
