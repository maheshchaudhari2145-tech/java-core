import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, c;

		System.out.println(" Enter the Row : ");
		r = sc.nextInt();
		System.out.println(" Enter the Column : ");
		c = sc.nextInt();

		int a[][] = new int[r][c];

		accept(a, r, c);
		display(a, r, c);

	}

	public static void accept(int a[][], int r, int c) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();

			}
		}

	}

	public static void display(int a[][], int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
	}

}