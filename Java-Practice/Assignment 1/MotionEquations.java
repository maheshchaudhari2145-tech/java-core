// Accept the initial velocity (u) , acceleration (a) , and time (t). Print the final velocity 
// (v) and the distance (s) travelled. ( Hint : v = u + at, s = u + at^2)
import java.util.Scanner;

public class MotionEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial velocity (u): ");
        double u = sc.nextDouble();
        System.out.print("Enter acceleration (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter time (t): ");
        double t = sc.nextDouble();

        double v = u + a * t;
        double s = u * t + 0.5 * a * t * t;

        System.out.println("Final velocity = " + v);
        System.out.println("Distance travelled = " + s);
        sc.close();
    }
}
