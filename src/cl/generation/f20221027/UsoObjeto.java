package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// instancia de clases

		Auto auto1 = new Auto(); // NO SE IMPORTA PQ ESTÁ EN LA MISMA CARPETApackage
		// se asiga valor auto1.marca ssi marca es public
		// asignar valores para atributo privado a traves del ----METODO SETER----

		auto1.setColor("verde");
		auto1.setMarca("donfeng");
		auto1.setCilindrada(2.2f);
		auto1.setModelo("station wagon");
		auto1.setRendimiento(2.5f);

		System.out.println(auto1.toString()); // para visualizar el arreglo se convierte a String

//		consultar el contenido de los atributos

		System.out.println(auto1.getColor());

		// nueva instancia de auto desde un objeto con atributos definido

		Auto car = new Auto("Nissan", "verde", "4x4", 2.3f, 2.5f);

		System.out.println(car.toString());

	}

}
