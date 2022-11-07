package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		
		ArrayList<Basquebolista> listaJugadores= new ArrayList<Basquebolista>();
		
		Basquebolista jugador1 = new Basquebolista();	
		jugador1.setNombre("ismael ");
		jugador1.setApellido("cancino");
		jugador1.setAltura(1.87f);
		
		
//		agregar jugador 1 a arraylist listajugadores
		
		listaJugadores.add(jugador1);		
		

		Basquebolista jugador2 = new Basquebolista();	
		jugador2.setNombre("julio ");
		jugador2.setApellido("kiate");
		jugador2.setAltura(2.10f);
		
		
		listaJugadores.add(jugador2);		
		
		
		 for (Basquebolista jugador: listaJugadores) {
			 System.out.println(jugador.toString());
			 
			 
		 }
		 
		
		
		Kine kinesiologo= new Kine ();
		kinesiologo.setNombre("jaime ");
		kinesiologo.setApellido("Ramirez");
		kinesiologo.setEdad(33);
		kinesiologo.setEspecialidad("kine deportivo");
		kinesiologo.setTitulo("kinesiologo");

		
		
		 
		
		
		
		
		
	}

}
