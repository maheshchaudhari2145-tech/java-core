// The basic salary of an employee is decided at the time of employement, which may
// be different for the different employees. Apart from the basic, employee gets 10 %
// of the basic of rent, 30 % of basic as dearness allowance. A professional tax of 
// 5 % of basic is deducted from salary. Accept the emoloyee id and basic salry for 
// an employee and ourput the take home salary of the employee.
import java.util.Scanner;
public class EmployeeSalary {

	public static void main ( String [] args ) {
	
		Scanner sc = new Scanner ( System.in );
		System.out.println ( " Enter the ID " );
		double id = sc.nextDouble ();
		System.out.println ( " Enter the Basic Salary " );
		double basic = sc.nextDouble ();
		
		double hra = 0.1 * basic ;
		double da = 0.3 * basic ;
		double tax = 0.05 * basic ;

		double net = basic + hra + da - tax ;

		System.out.println ( " Employee ID : " +id );
		System.out.println ( " Take Home Salary : " +net );
		System.out.println( " HRA : " +hra);
		System.out.println ( " DA :  " +da );
		System.out.println(" TAX : " +tax);
			
		
	}
}