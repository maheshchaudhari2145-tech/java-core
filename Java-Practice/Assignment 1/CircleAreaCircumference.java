// Accept radious of a circle and print the area and circumference of circle.
// ( Hint : area = PI * r^2 , circumference = 2 * PI * r )
import java.util.Scanner ;
public class CircleAreaCircumference {
	public static void main (String [] args ) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println (" Enter the radious : " );
		
		double r = sc.nextDouble();
		double area = Math.PI * r * r;
		double circumference = 2 * Math.PI * r ;
		
		System.out.println (" Area of Circle = " +area );
		System.out.println (" Circumference of the Circle = " +circumference );
		
		sc.close();
		
	}
}