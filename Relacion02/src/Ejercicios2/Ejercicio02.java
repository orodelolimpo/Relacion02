package Ejercicios2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// 2. Algoritmo que pida 3 números e indique cual es el menor de los tres
		
		System.out.println( "Introduce el primer número ");
		Scanner teclado = new Scanner (System.in);
		double numero1= teclado.nextInt();
		System.out.println("Introduce el segundo número");
		double numero2= teclado.nextInt();
		System.out.println("Introduce el tercer número");
		double numero3= teclado.nextInt();
		if (numero1< numero2 && numero1<numero3) {
			System.out.printf("El menor es el %.2f \n", numero1);
		}else if ()
		}
		

	}

}
