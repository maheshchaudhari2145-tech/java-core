import java.util.Scanner;

public class Q11_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == b)
            System.out.println(a + " is equal to " + b);
        else if (a > b)
            System.out.println(a + " is greater than " + b);
        else
            System.out.println(a + " is less than " + b);
    }
}
