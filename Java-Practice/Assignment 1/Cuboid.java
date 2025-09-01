import java.util.Scanner;

public class Cuboid {
	public static void main (String [] args){
		
		Scanner sc = new Scanner ( System.in );
		System.out.println ( " Enter length , breath , Height : " );
		double l = sc.nextDouble ();
		double b = sc.nextDouble ();
		double h = sc.nextDouble ();

		double sa = 2 * (l*b + l*h + b*h);
		double vol = l * b * h ;

		System.out.println ( " Surface Area : " + sa );
		System.out.println ( " Volume : " + vol ) ;
		
 
	}
}