package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter rectangle width and height:");
		Rectangle.width=sc.nextDouble();
		Rectangle.height=sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", Rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", Rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", Rectangle.diagonal());
		
		sc.close();

	}

}
