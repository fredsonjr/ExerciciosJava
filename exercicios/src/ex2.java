import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x, area;
		x=sc.nextDouble();
		
		area=(3.14159 * Math.pow(x, 2));
		System.out.printf("A=%.4f%n", area);

		sc.close();
	}

}
