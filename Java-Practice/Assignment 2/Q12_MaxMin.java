import java.util.Scanner;

public class Q12_MaxMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Logic 1 – if-else
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        // Logic 2 – conditional operator
        int max2 = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int min2 = (a < b) ? (a < c ? a : c) : (b < c ? b : c);

        System.out.println("Max (?:) = " + max2);
        System.out.println("Min (?:) = " + min2);
    }
}
