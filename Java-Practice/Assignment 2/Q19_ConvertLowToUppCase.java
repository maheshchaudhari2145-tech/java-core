import java.util.Scanner;

public class Q19_ConvertLowToUppCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch))
            System.out.println("Uppercase: " + Character.toUpperCase(ch));
        else if (Character.isUpperCase(ch))
            System.out.println("Lowercase: " + Character.toLowerCase(ch));
        else
            System.out.println("Not an alphabet character.");
    }
}
