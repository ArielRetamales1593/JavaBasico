package cl.generation.f20221027;

import java.util.Scanner;

public class Calculo_menu_ej1 {

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
		} while (opciones < 0 || opciones > 3);
		
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
		
		
		
		
		
		
	}

	
	
	
	public static void menu() {
		
		System.out.println("********************");
		System.out.println("*       MENU       *");
		System.out.println("********************");
		System.out.println("*1.-   Triángulo  *");
		System.out.println("*2.-   Circunferencia *");
		System.out.println("*3.-	Rectángulo  *");
		System.out.println("*0.-   SALIR       *");
		System.out.println("********************");
		
		
	}
	
	
	
	
	
	

}
