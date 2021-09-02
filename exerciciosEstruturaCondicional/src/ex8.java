import java.util.Locale;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double aux=0.0;
		
		if(salario<=2000.0) {
			System.out.println("Isento");
		}else if(salario <=3000.00) {
			aux=(salario-2000)*0.8;
			System.out.printf("R$ %.2f%n", aux);
		}else if(salario<=4500.00) {
			aux=(salario-3000)*0.18+1000*0.08;
			System.out.printf("R$ %.2f%n", aux);
		}else {
			aux=(salario-4500)*0.28+1500*0.18+1000*0.08;
			System.out.printf("R$ %.2f%n", aux);
		}
		sc.close();

	}

}
