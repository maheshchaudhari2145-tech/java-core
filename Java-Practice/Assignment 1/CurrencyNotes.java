import java.util.Scanner;

public class CurrencyNotes {
	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in ) ;
		System.out.println ( " Enter Amount : " );
		int amt = sc.nextInt();		
		
		int tens = amt / 10;
		int fives =  ( amt % 10 ) / 5 ;
		int ones = amt % 5 ;

		System.out.println ( " Tens = " + tens );
		System.out.println ( " Fives = " + fives );
		System.out.println ( " Ones  = " + ones );

	}
}