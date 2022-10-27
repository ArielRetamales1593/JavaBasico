package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {

		Float IMC = imc();

		System.out.println("TU IMC ES DE " + IMC);

		nivelIMC(IMC);
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
