import java.util.Scanner;

public class ArrayAcceptDisplay{

	public static void main ( String [] args )  {
	
		Scanner sc = new Scanner ( System.in );

		System.out.println ( " Enter the N : " );
		int n = sc.nextInt();
		int [] a = new int [n];
		// int a[] = new int [n];
		for ( int i=0; i<n ; i++)
			a[i] = sc.nextInt();
		System.out.println( " Given Element of Array : " );
				
		for ( int x : a ) {
		System.out.println(x);
		}
		// OR  
		/* for ( int i=0; i<n ; i++ )
		System.out.println ( i ); */ 
	}
}