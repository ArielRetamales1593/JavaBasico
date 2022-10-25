package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	set o HashSet 

		// HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
//		no permite datos repetidos y los ordena aleatoriamente

		HashSet<String> relatores = new HashSet<String>();

		relatores.add("diego");
		relatores.add("nathalie");

//		verificar el contenido del arreglo
		boolean verificarName = relatores.contains("diego");

		HashSet<String> frutas = new HashSet<String>();

		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Naranja");
		frutas.add("Platano");
		frutas.add("Manzana");
//
//		      System.out.println(frutas);
//		out : [Naranja, Manzana, Mango, Platano]

		int i = 0;

		while (i < frutas.size()) {

			System.out.println(frutas.get(i));
			i++;

		}

		System.out.println(frutas);
	}

}
