package application;

import java.util.Locale;
import java.util.Scanner;
import entites.Reactangle;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Reactangle reactangle = new Reactangle();
		System.out.println("Enter rectangle width and height:");
		reactangle.width = sc.nextDouble();
		reactangle.height = sc.nextDouble();
		System.out.printf("AREA = %.2f",reactangle.area());
		System.out.println();
		System.out.printf("PERIMETER = %.2f",reactangle.perimeter());
		System.out.println();
		System.out.printf("DIAGONAL = %.2f",reactangle.diagonal());
		
		sc.close();

	}

}
