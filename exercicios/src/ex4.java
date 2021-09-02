import java.util.Locale;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, horasTrabalhadas;
		double valor, salario;
		n=sc.nextInt();
		horasTrabalhadas=sc.nextInt();
		valor=sc.nextDouble();
		
		salario=horasTrabalhadas*valor;
		
		System.out.println("NUMBER = " + n);
		System.out.println("SALARY = U$ " + salario);
		
		sc.close();

	}

}
