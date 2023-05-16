// Example 3 : HelloNameDialog.java
// Nguyen Viet Thuan - 20210826
import javax.swing.JOptionPane;
public class HelloNameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		result = JOptionPane.showInputDialog("Please enter your name");
		JOptionPane.showMessageDialog(null, "hi "+result);
	}

}
