import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool=0, gasolina=0, diesel=0;
		int n = sc.nextInt();
		
		while(n!=4) {
			if(n==1) {
				alcool+=1;
			} else if(n==2) {
				gasolina+=1;
			} else if(n==3) {
				diesel+=1;
			}
			n = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
