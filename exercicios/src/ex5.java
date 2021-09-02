import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qnt1, qnt2;
		double valor1, valor2, valorTotal;
		
		cod1=sc.nextInt();
		qnt1=sc.nextInt();
		valor1=sc.nextDouble();
		
		cod2=sc.nextInt();
		qnt2=sc.nextInt();
		valor2=sc.nextDouble();
		
		valorTotal=qnt1*valor1 + qnt2*valor2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();

	}

}
