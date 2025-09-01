import java.util.Scanner;

public class EmployeeSalarySlip {

	public static void main (String [] args) {
		Double da ,hra , tax , basicSalary , totalSalary;
		int id ;
		String name ;
		Scanner sc = new Scanner (System.in);
    		
		System.out.println( "Enter the Employee Details : " );
		System.out.println( " ID : " );
		id = sc.nextInt();
		System.out.println( "Name : ");
		name = sc.next() ;
		System.out.println("Basic Salary : ");
		basicSalary = sc.nextDouble();
		System.out.println ( " DA  (%): ");
		da = sc.nextDouble();
		System.out.println (" HRA (%): ");
		hra = sc.nextDouble();
		System.out.println (" TAX (%): ");
		tax = sc.nextDouble();
		

		totalSalary = basicSalary + (( basicSalary * (da + hra - tax))/ 100);
		System.out.println ( " ID : " +id );
		System.out.println ( " NAME : " +name );
		System.out.println ( " Total Salary : " +totalSalary );

	}

}