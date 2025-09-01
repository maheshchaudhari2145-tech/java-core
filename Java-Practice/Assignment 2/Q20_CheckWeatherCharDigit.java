import java.util.Scanner;

public class Q20_CheckWeatherCharDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a Digit");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a Lowercase Alphabet");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an Uppercase Alphabet");
        else
            System.out.println(ch + " is not a Digit or Alphabet");
    }
}
