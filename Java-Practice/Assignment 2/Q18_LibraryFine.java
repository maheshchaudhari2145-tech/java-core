import java.util.Scanner;

public class Q18_LibraryFine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();

        int fine;
        if (days <= 5)
            fine = 1 * days;
        else if (days <= 10)
            fine = 2 * days;
        else
            fine = 5 * days;

        System.out.println("Fine = Rs. " + fine);
    }
}
