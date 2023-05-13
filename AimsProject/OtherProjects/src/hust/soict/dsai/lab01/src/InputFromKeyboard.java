import java.util.Scanner;
public class InputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalString = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("what's your name?");
		String strName = keyboard.next();
		finalString += strName;
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		finalString += "," + iAge + " years old. ";
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		finalString += "Your height is " + dHeight;
		System.out.println(finalString);
	}	 

}
