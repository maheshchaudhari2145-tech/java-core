import java.util.Scanner;

public class MeanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double am = (a + b) / 2;
        double hm = (a * b) / (a + b);

        System.out.println("Arithmetic Mean = " + am);
        System.out.println("Harmonic Mean = " + hm);
        sc.close();
    }
}
