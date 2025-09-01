import java.util.Scanner;

public class Q7_FirstNumberBetweenOtherTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a > b && a < c) || (a > c && a < b))
            System.out.println(a + " is between " + b + " and " + c);
        else
            System.out.println(a + " is not between " + b + " and " + c);
    }
}
