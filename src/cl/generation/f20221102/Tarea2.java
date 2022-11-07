package cl.generation.f20221102;

import java.util.ArrayList;

public class Tarea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesores profe1 = new Profesores();

		profe1.setNombre("julian");
		profe1.setApellido("ramirez");
		profe1.setEdad(29);
		profe1.setAsignatura("matematicas");
		profe1.setCursoAcargo("4-C");

		Profesores profe2 = new Profesores();

		profe2.setNombre("ramiro");
		profe2.setApellido("gomez");
		profe2.setEdad(47);
		profe2.setAsignatura("lenguaje");
		profe2.setCursoAcargo("3-d");

		Profesores profe3 = new Profesores();

		profe3.setNombre("daniel");
		profe3.setApellido("henrique");
		profe3.setEdad(47);
		profe3.setAsignatura("historia");
		profe3.setCursoAcargo("2-b");

		ArrayList<Profesores> ListaProfesor = new ArrayList<Profesores>();

		ListaProfesor.add(profe1);
		ListaProfesor.add(profe2);
		ListaProfesor.add(profe3);
		

		for (Profesores profesor : ListaProfesor) {
			System.out.println(profesor.toString());}

	
	
	
	
	
	
	}
	

}
