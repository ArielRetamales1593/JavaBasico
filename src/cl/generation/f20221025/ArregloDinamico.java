package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> relatores = new ArrayList<String>();

		relatores.add("ariel");
		relatores.add("valentina");
		relatores.add("diego");

		System.out.print(relatores);

//		tamaño del array dinamico o array list 
//		dinamico.size() y estatico .length()

		relatores.size();

		System.out.println(relatores.size());

// acceder a un elemento 
		relatores.get(2);

//System.out.println(relatores.get(7)); fuera del tamaño
		System.out.println(relatores.get(2));

// eliminar del arreglo 
		relatores.remove(0);

		System.out.println(relatores);

//  for en arreglo dinamico ocupar SIZE en vez de length y GET para acceder en vez de [i]
		for (int i = 0; i < relatores.size(); i++) {
			System.out.println("relator: " + relatores.get(i));
		}
		System.out.println("###################################");

//  FOR INTERADOR OJO PQ ES DIFICIL 
		
//	utiliza el tipo de dato , el nombre del arreglo en singular " relator " y luego : y la variable a recorrer
		for (String relator : relatores) {

			System.out.println(relator);

		}

	}

}
