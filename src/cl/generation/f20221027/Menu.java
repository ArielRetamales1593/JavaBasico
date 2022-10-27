package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opciones = 0;
		int contadorError = 4;
		menu();

		do {
			System.out.println(" Seleccione una opción ");
			opciones = scanner.nextInt();

//			opcion 0
			if (opciones == 0) {
				System.out.println("Fin del programa");
				break;
			}

			if (opciones < 0 || opciones > 3) {
				contadorError--;
				System.out.println(" te quedan " + contadorError + " intentos ");

			}

			if (contadorError == 0) {
				System.out.println("Se acabaron tus intentos- te fuiste bloketa");

				break;
			}
		} while (opciones < 0 || opciones > 4);

		if (opciones == 0 || contadorError == 0) {
			System.out.println("adios");

		} else {
			System.out.println("fuera del while  " + "ingreso opcion " + opciones); // tester
			System.out.println("ingrese un número");
			float num1 = scanner.nextFloat();
			System.out.println(" ingrese el 2do número");
			float num2 = scanner.nextFloat();
			float resultado = 0;

			switch (opciones) {
			case 1: // suma
				resultado = num1 + num2;
				System.out.println(resultado);
				break;
			case 2:// resta

				resultado = num1 - num2;
				System.out.println(resultado);
				break;
			case 3: // mult

				resultado = num1 * num2;
				System.out.println(resultado);
				break;
			case 4:// division
				if (num2 == 0) {
					System.out.println("No SE PUEDE DIVIR POR 0");
				} else {
					resultado = num1 / num2;
					System.out.println(resultado);
				}
				break;

			default:
				System.out.println("opción no valida");
				break;
			}

		}

//	    Menu
//		calculadora con  4 operaciones basicas
//      solicitar 2 numeros float
//		imprimir resultados 
//		preguntar a usuario , ofrecer repeticion (bucles)
//		definir los metodos
//		validaciones
//		terminar ejecucion 
//		limpiar variables

//	INVESTIGAR TDT 

	}

	public static void menu() {

		System.out.println("+*+*+*+*+*+*+*+*");
		System.out.println("  --M-e-n-u--");
		System.out.println("+*+*+*+*+*+*+*+*");
		System.out.println("1 Suma");
		System.out.println("2 Resta");
		System.out.println("3 Multipliacion");
		System.out.println("4 Division");
		System.out.println("0 Salir");
		System.out.println("+*+*+*+*+*+*+*+*");

	}

}
