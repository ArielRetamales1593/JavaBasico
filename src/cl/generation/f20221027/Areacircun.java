package cl.generation.f20221027;

import java.util.Scanner;

public class Areacircun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float resultado = areaCircunferencia(7);

		System.out.println(resultado);

	}

	public static float areaCircunferencia(float num1) {

		float resultado = (float) (Math.PI * (num1 * num1));

		return resultado;

	}

}
