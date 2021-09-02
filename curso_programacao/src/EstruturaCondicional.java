import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
				
		if(hora > 0) {
			System.out.println("Bom dia!");
		}else if(hora >=12){
			System.out.println("Boa tarde!");
		}else if(hora >=18 || hora< 24) {
			System.out.println("Boa noite!");
		}
		
		sc.close();
	}

}
