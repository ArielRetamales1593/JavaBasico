package cl.generation.f20221026;

public class Funciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		funcion o metodo

		nombreMetodo1();
		nombreMetodo2("ariel");
//		se asigna el valor de retorno a una variable 
		// siempreasignar
		Integer retorno = retorno1();
		System.out.println(retorno / 5);

		String nombreCompleto = getnombreCompleto("ariel", "retamales", " tapia ");

		System.out.println(nombreCompleto);
		llamadaFuncion();

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

	/**
	 * 
	 * @param nombre
	 * @param app
	 * @param appm
	 * @return
	 */

	public static String getnombreCompleto(String nombre, String app, String appm) {
		String nombreCompleto = nombre + " " + app + appm;
//		Swagger--------------------------------------------------------------------- Tiene q ver con las Apis
		return nombreCompleto;

	}
	
	
//	metodo o funcion  q llama a otra funcion 
	
	
	public static void llamadaFuncion () {
		
		
		System.out.println(getnombreCompleto("danie"," dasd","s ad"));
		
	}
	
	
	
	
	
	

}
