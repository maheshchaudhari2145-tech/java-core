import java.util.Scanner;

public class Q4_CircleSphereMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("1: Area of Circle");
        System.out.println("2: Circumference of Circle");
        System.out.println("3: Volume of Sphere");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Area of Circle = " + (Math.PI * r * r));
                break;
            case 2:
                System.out.println("Circumference of Circle = " + (2 * Math.PI * r));
                break;
            case 3:
                System.out.println("Volume of Sphere = " + ((4.0 / 3) * Math.PI * r * r * r));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
