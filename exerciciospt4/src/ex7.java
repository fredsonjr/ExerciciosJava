import java.util.Scanner;
import java.lang.Math;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int var1;
			int var2;
			int var3;
			
			var1=(int)(Math.pow(i, 1));
			var2=(int)(Math.pow(i, 2));
			var3=(int)(Math.pow(i, 3));
			
			System.out.printf("%d %d %d%n", var1, var2, var3);
			
			
		}
		
		sc.close();

	}

}
