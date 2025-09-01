import java.util.Scanner;

public class Q16_MarksObtained {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        if (avg >= 60)
            System.out.println("Class: First Class");
        else if (avg >= 50)
            System.out.println("Class: Second Class");
        else if (avg >= 40)
            System.out.println("Class: Pass Class");
        else
            System.out.println("Class: Fail");
    }
}
