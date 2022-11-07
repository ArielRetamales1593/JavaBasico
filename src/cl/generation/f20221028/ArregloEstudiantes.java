package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class ArregloEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// solicitar de manera dinámica el ingreso de los miembros de una corte

		// para crear el arreglo dinamico
		
		
		ArrayList<Estudiante> estudiantes= new ArrayList<Estudiante>();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese su nombre");
		String nombre = sc.next() ;
		
		System.out.println("Ingrese su apellido");
		String apellido = sc.next() ;
		
		System.out.println("Ingrese su edad");
		Integer edad = sc.nextInt() ;

		System.out.println("Ingrese su rut");
		String rut = sc.next() ;
		
		System.out.println("Ingrese su correo");
		String correo = sc.next() ;
		
		System.out.println("Ingrese su nombre");
		String curso= sc.next() ;
		
		
		
		for (int i = 0; i<estudiantes.size;i++) {
		
		estudiantes[0].setNombre(nombre);
		estudiantes[0].setApellido(apellido);
		estudiantes[0].setEdad(edad);
		estudiantes[0].setRut(rut);
		estudiantes[0].setCorreo(correo);
		estudiantes[0].setCurso(curso);
		estudiantes[i]= new Estudiante(nombre,apellido,edad,rut,curso,correo);
		}Estudiantes
		
		
		
		
	}

}
