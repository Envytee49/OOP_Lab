import java.util.Scanner;
public class StarDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n = scan.nextInt();
		int m = n;
		int x = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < m; j++) {
				System.out.print(" ");
			}
			m--;
			for(int k = 1; k <= x; k++) {
				System.out.print("*");
			}
			x+=2;
			System.out.println("");
		}
			
	}

}
