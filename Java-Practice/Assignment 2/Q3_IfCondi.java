import java.util.Scanner;

public class Q3_IfCondi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using if
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

        // Using conditional operator
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Using ?: " + num + " is " + result);
    }
}
