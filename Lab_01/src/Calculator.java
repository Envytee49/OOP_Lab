// Example 5 : Calculator.java
// Nguyen Viet Thuan - 20210826
import javax.swing.JOptionPane;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null, 
					"Please input the first number: ",
					"Input the first number",
					JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ",
				"Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		System.out.println("Calculation:");
		System.out.println("Sum: " + num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println("Product: " + num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println("Quotient: " + num1 + " / " + num2 +" = " + (num1/num2));
	}

}
