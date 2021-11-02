import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com M: ");
		int m = sc.nextInt();
		System.out.print("Entre com N: ");
		sc.nextLine();
		int n = sc.nextInt();
		
		int[][] mat = new int [m][n];
		System.out.println("Entre com os valores da matriz " + m + "x" + n + ": ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m; i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j]);
				}
			}
		System.out.println();
		System.out.println();
		System.out.print("Entre com um numero que existe na matriz: ");
		int x = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					System.out.println();
				}
			}
		}
		sc.close();
	}
}