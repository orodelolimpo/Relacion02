package Ejercicios2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// 1. Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son 
		//iguales.
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número");
		int numero1= teclado.nextInt();
		System.out.println("Introduzca otro número");
		int numero2= teclado.nextInt();
		if (numero1 > numero2) {
		System.out.println("El número " +numero1+ "  es mayor que  " +numero2);
		}else {
			System.out.println("El número " +numero1+ " es menor que " +numero2);
		}
	}
}
		
