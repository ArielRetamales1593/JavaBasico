package cl.generation.f20221026;

import java.util.Scanner;

public class BUCLEDOWHILE_TEST {

	public static void main(String[] args) {
//	DO WHILE 

//ESTRUCTURA
//	do {
//		
//	} while (condition);
//		
//	

//		Scanner sc = new Scanner(System.in);
//		int edad = 0;
//
//		do {
//			System.out.println("ingresa tu edad");
//			edad = sc.nextInt();
//		} while (edad < 18 || edad > 55);
//
//		System.out.println("eres mayor de edad " + edad);
//
//		sc.close();
//	
//	
//	
//	
//	
	estatura();
	
	
	
	
	
	
	
	
	
	}
	
	public static void estatura() {
	Scanner sc = new Scanner(System.in);
	float estatura = 0;

	do {
		System.out.println("ingresa tu estatura");
		estatura= sc.nextFloat();
	} while (estatura < 1.75 );

	System.out.println("  estás dentro el promedio " + estatura);

	sc.close();

	}
	

}
