import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo =  sc.nextInt();
		int quantidade = sc.nextInt();
		
		double valor;
		if(codigo==1) {
			valor=quantidade*4.0;
		}else if(codigo==2) {
			valor=quantidade*4.5;
		}else if(codigo==3) {
			valor=quantidade*5.0;
		}else if(codigo==4) {
			valor=quantidade*2.0;
		}else {
			valor=quantidade*1.5;
		}
		
		System.out.printf("Total : R$ %.2f%n", valor);
		sc.close();
	}
}
