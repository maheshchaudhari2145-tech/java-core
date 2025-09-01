import java.util.Scanner;

public class Q3_NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        System.out.println("1: Equality Check");
        System.out.println("2: Less Than Check");
        System.out.println("3: Quotient and Remainder");
        System.out.println("4: Range Check (Enter number to check)");
        System.out.println("5: Swap x and y");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(x == y ? "x is equal to y" : "x is not equal to y");
                break;
            case 2:
                System.out.println(x < y ? "x is less than y" : "x is not less than y");
                break;
            case 3:
                if (y != 0)
                    System.out.println("Quotient = " + (x / y) + ", Remainder = " + (x % y));
                else
                    System.out.println("Division by zero not allowed.");
                break;
            case 4:
                System.out.print("Enter number to check: ");
                int n = sc.nextInt();
                if (n >= x && n <= y)
                    System.out.println(n + " lies between " + x + " and " + y);
                else
                    System.out.println(n + " does not lie between " + x + " and " + y);
                break;
            case 5:
                int temp = x;
                x = y;
                y = temp;
                System.out.println("After swapping: x = " + x + ", y = " + y);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
