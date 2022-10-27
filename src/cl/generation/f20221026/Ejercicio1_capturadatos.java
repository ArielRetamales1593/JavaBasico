package cl.generation.f20221026;

import java.util.Scanner;

public class Ejercicio1_capturadatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreCompleto = getNombreCompleto();

		float imc = imc();
		System.out.println(nombreCompleto + imc);
		nivelIMC(imc);
	}

	public static String getNombreCompleto() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese su nombre");
		String name = scanner.next();
		System.out.println("ingrese su apellido");
		String apellido1 = scanner.next();
		String nombreCompleto = name + " " + apellido1;
		return nombreCompleto;

	}

	public static Float imc() {

		// capturar datos ingresados x el usuario

		Scanner scanner = new Scanner(System.in);
		// calculo de iMC ; KILOS / (ESTATURA*ESTAT

		System.out.println("ingrese su peso en kilogramos");
		float peso = scanner.nextFloat();

		System.out.println("el peso del paciente es " + peso);

		System.out.println("ingrese su estatura en metros");
		float estatura = scanner.nextFloat();

		System.out.println("la estatura del paciente es " + estatura);
		scanner.close();

		float imc = peso / (estatura * estatura);

		return imc;

	}

	public static void nivelIMC(Float IMC) {

		/*
		 * Por debajo de 18.5 Bajo peso 18.5 - 24.9 Normal 25.0 - 29.9 Sobrepeso 30.0 o
		 * más Obeso
		 */

		if (IMC < 18.5F) {

			System.out.println("bajo de peso");

		} else if (IMC >= 18.5F && IMC < 25) {
			System.out.println("peso normal");

		} else if (IMC >= 25F && IMC < 30) {

			System.out.println("sobre peso");

		} else if (IMC > 30) {
			System.out.println("tamos gorditos");
		}

	}

}
