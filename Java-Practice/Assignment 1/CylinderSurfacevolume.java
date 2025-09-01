// Accept the dimensions of a cylinder and print the surface area and volume. 
//(Hint : surface area = 2*PI*r^2 + 2*PI*h , volume = PI * r^2 * h )
import java.util.Scanner;
public class CylinderSurfacevolume {
	public static void main ( String [] args ) {
		
		Scanner sc = new Scanner (System.in );
		System.out.println ( " Enter the Radious of Cylinder : " );
		double r = sc.nextDouble ();
		System.out.println ( " Enter the Height of Cylinder : " );
		double h = sc.nextDouble ();
		
		double surfaceArea = 2 * Math.PI * r * ( r + h );
		double volume = Math.PI * r * r * h ;

		System.out.println ( " Surface of Area = " +surfaceArea );
		System.out.println ( " Volume = " +volume );

		sc.close();


	}
}