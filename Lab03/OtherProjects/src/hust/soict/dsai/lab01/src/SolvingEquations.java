import java.util.Scanner;
public class SolvingEquations {

	public static void main(String[] args) {
		// First degree equation
//		firstDegreeEquation();
		// System of first degree equation
//		systemOfFirstDegreeEquation();
		// Second degree equation
		secondDegreeEquation();
	}
	static void firstDegreeEquation()
	{
		Scanner scan = new Scanner(System.in);
		double a;
		do {
			System.out.println("Enter the coefficient for a:");
			a = scan.nextDouble();
			if(a == 0) {
				System.out.println("Invalid a cannot be 0");
			}else break;
		}while(a == 0);
		System.out.println("Enter the coefficient for b:");
		double b = scan.nextDouble();
		System.out.println("The solution is x = "+ (-b / a));
	}
	static void systemOfFirstDegreeEquation()
	{
		Scanner scan = new Scanner(System.in);
		double det, a11, a12, a21, a22;
		do {
			System.out.println("Enter coefficients for a11,a12,a21,a22 respectively:");
			a11 = scan.nextDouble();
			a12 = scan.nextDouble();
			a21 = scan.nextDouble();
			a22 = scan.nextDouble();
			det = a11 * a22 - a12 * a21;
			if(det == 0) {
				System.out.println("System has either no solution or infinitely many solutions.");
			}else break;
		}while(det == 0);
		System.out.println("Enter coefficients for b1, b2:");
		double b1 = scan.nextDouble();
		double b2 = scan.nextDouble();
		double detx = b1 * a22 - a12 * b2;
		double dety = a11 * b2 - b1 * a21;
		System.out.println("The solution is:\nx = " + (detx/det) + "\ny = " + (dety/det));
		
		
	}
	static void secondDegreeEquation() 
	{
		Scanner scan = new Scanner(System.in);
		double a, b, c, delta;
		do {
			System.out.println("Enter the coefficient for a:");
			a = scan.nextDouble();
			if(a == 0) {
				System.out.println("Invalid a cannot be 0");
			}else break;
		}while(a == 0);
		System.out.println("Enter the coefficient for b:");
		b = scan.nextDouble();
		System.out.println("Enter the coefficient for c:");
		c = scan.nextDouble();
		delta = b * b - 4 * a * c;
		if(delta < 0) {
			System.out.println("NO SOLUTIONS");
		}else if(delta == 0) {
			System.out.println("DOUBLE SOLUTION\nx = "+ ( -b / (2 * a) ));
		}else {
			System.out.println("TWO SOLUTIONS\nx1 = "+ (-b + Math.sqrt(delta)) / (2*a) +
								"\nx2 = "+ (-b - Math.sqrt(delta)) / (2*a));
		}
		
	}

}
