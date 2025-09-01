import java.util.Scanner;

public class Q10_ValidTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}
