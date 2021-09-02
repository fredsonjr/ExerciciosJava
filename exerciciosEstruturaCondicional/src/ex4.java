import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, tempoTotal;
		horaInicial=sc.nextInt();
		horaFinal=sc.nextInt();
		
		if(horaInicial < horaFinal) {
			tempoTotal = horaFinal - horaInicial;
		}else {
			tempoTotal = 24 - horaInicial+ horaFinal;
		}
		
		System.out.printf("O JOGODUROU %d HORA(S)", tempoTotal);
		
		
		
		sc.close();

	}

}
