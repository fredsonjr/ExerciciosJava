import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		while(n!=2002) {
			System.out.println("Senha Invalida");
			n=sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		
		
		
		sc.close();

	}

}
