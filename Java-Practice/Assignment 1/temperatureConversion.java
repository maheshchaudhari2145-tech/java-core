// Accept the temperatures in Fahrenheit(F) and print it in Celsius(C) and Kelvin (K).
// (Hint : C = 5/9 (F-32), K = C + 273.15)

import java.util.Scanner ;
public class temperatureConversion {
	public static void main ( String [] args ) {
	
		Scanner sc = new Scanner ( System.in ) ;
		
		System.out.println ( " Enter the Temperature in Fahrenheit : " );
		double f = sc.nextDouble();
		
		double c = ( 5.0 / 9 ) * ( f - 32 );
		double k = c + 273.15;
		
		System.out.println ( " Celcius = " +c );
		System.out.println ( " Kelvin = " +k );

		sc.close ();
	}
}