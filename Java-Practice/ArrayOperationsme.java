import java.util.Scanner;

public class ArrayOperations {
	public static void main ( String [] args ){

		Scammer sc = new Scanner(System.in);
		System.out.println("Enter a N : ");
		int n = sc.nextInt();
				
		int a[] = new int [n];
		
		System.out.println("Enter a "+n+" elements");
		for (int i=0; i<n ; i++)
		    a[i] = sc.nextInt();

		while(true){
		 	System.out.println ("""
				1. Display
				2. Max
				3. Min
				4. Search
				5. Delete
				6. Sort
				7. Sum
				8. Avg
				9. Frequency
				10. Reverse
				11. Exit
				Enter the Choice :
			    """);
			int ch = sc.nextInt();
			switch (ch) {
				case 1 ->{
					display(a);
				}
				case 2 ->{
					System.out.println(" Max : " +max(a));
				}
				case 3 ->{
					System.out.println (" Min : " +min(a));
				}
				case 4 ->{
					System.out.println ("Enter a Element for Search : ");
					int key = sc.nextInt();
					if(search (a,key))
						System.out.println("Found !!");
					else
						System.out.println("Not Found !!!");
				}
				case 5 ->{
					System.out.println(" Enter tha Element for Search : ");
					int key = sc.nextInt();
					n = delete(a,n,key);
				}
				case 6 -> sort(a,n);
				case 7 -> System.out.println ("Sum : "+sum(a));
				case 8 -> System.out.println ("Avg : "+(sum(a)/n));
				case 9 ->{
					System.out.println("ENter a Element for Search : ");
					int key = sc.nextInt();
					System.out.println("Frequency is : " +frequency(a,key));
				}
				case 10 -> reverse(a);
				case 11 -> System.exit(0);

		}
	}
	

	public static void display (int arr[]) {
		for (int x : arr){
			System.out.println(x);
		}
}

	public static void max( int a[]){
		int max = a[0];
		for (int x : a ){
		if(max < x)
		max = x;
		}
		return max ;
	}

	public static int min (int a[]){
		int min = a[0];
		for (int x : a){
		if (min > x)
		  min = x;
		}
		return min;
	// Arrays.stream(a).max().getAsInt();
	}

	public static Boolean search(int a[],int key){
		for (int x : a) {
		   if ( x == key )
			return true;
		}
		  return false;
	}

	public static int delete ( int a[],int n, int key ){
		for ( int i=0; i<n ; i++) {
		    if ( a[] == key ){
			for ( int j=i ; j<n-1 ; j++)
			    a[j] = a[j+1];
			n--;
			i--;
		}
	    }
		return n;
	}

	public static void sort(int a[], int n) {
		for (int i=0; i<n ; i++) {
		    for (int j=0; j<n-i-1; j++) {
			if (a[j] > a[j+1]){
			   int temp = a[j];
			   a[j] = a[j+1];
			   a[j+1] = temp;
			}
		}
	}
}

	





	
	
		


















}