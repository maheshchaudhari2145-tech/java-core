import java.util.Scanner;
j
public class Swapping {
	
	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in ) ;
		System.out.println ( " Enter the Two Number : " );
		int x = sc.nextInt ( );
		int y = sc.nextInt ( );
		
		// Using temp 
		int temp = x ; x = y ; y = temp;
		System.out.println ( "Original : x = " + x + " y = " + y );

		// Using + AND - 
		 x = x + y; y = x - y ; x = x - y ;
		System.out.println ( " Using + and - : x = " + x + " Y = " + y ); 

		// Using * And /
		 x = x * y ; y = x / y; x = x / y ;
		System.out.println ( " Using * and / : x = " + x + " y = " + y );
	}
	
}