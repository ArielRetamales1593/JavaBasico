package cl.generation.f20221025;

public class Funciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		funcion o metodo
 
		nombreMetodo1();
		nombreMetodo2("ariel");
		Integer retorno= retorno1();
		System.out.println(retorno/5);
				

	}

	public static void nombreMetodo1() {
		System.out.println("estoy inside the funtion");

	}

	public static void nombreMetodo2(String nombre) {

		System.out.println("hola soy" + nombre);

	}

//	funciones con retorno

	public static Integer retorno1() {

		Integer total = 20;
		return total;

	}

}
