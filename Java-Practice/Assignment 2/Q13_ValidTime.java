import java.util.Scanner;

public class Q13_ValidTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours (0-23): ");
        int h = sc.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int m = sc.nextInt();
        System.out.print("Enter seconds (0-59): ");
        int s = sc.nextInt();

        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60)
            System.out.println("Valid Time");
        else
            System.out.println("Invalid Time");
    }
}
