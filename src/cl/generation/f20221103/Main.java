package cl.generation.f20221103;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Usuario usuario = new Usuario() ;
	
//		ArrayList<String> fono = new ArrayList<String>();
//		fono.add("123123");
//		fono.add("1231231232");
//		fono.add("7688123");
		//agregar varios telefonos primera forma y se inicializa el arreglo acá en el main
//		es mejor hacerlo en el constructor vacio 
		
		
		usuario.getTelefonos().add("78727127");
		usuario.getTelefonos().add("57985264");
		usuario.getTelefonos().add("998877446");
		System.out.println(usuario.getTelefonos());
		
//		definir variable de arreglo en  el constructor vacio =this.telefonos=new ArrayList<String>();
		
		
		//trabajar con objetos (direccion)
//		se instancia el objeto nuevo 
//		objeto de colaboracion
		Direccion direccion = new Direccion();
		direccion.setCalle("peatones D");
		direccion.setNumero("5728");
		direccion.setRegion("metropolitana");
		// se llena 
		
		// se asigna con este metodo
		usuario.setDireccion(direccion);
		
		System.out.println(usuario.getDireccion().toString());
//		se imprime de esta forma 
		
		
		

		
		
	}

}
