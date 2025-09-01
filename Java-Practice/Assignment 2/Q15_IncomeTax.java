import java.util.Scanner;

public class Q15_IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual basic salary: ");
        double salary = sc.nextDouble();

        double tax;
        if (salary < 150000)
            tax = 0;
        else if (salary <= 300000)
            tax = 0.2 * salary;
        else
            tax = 0.3 * salary;

        System.out.println("Income Tax = " + tax);
    }
}
