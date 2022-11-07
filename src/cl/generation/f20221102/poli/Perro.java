package cl.generation.f20221102.poli;

public class Perro extends Mascota {
	
	private String sonido ;

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	public Perro(String sonido) {
		super();
		this.sonido = sonido;
	}




	public Perro(String raza, String nombre, int edad, String sexo) {
		super(raza, nombre, edad, sexo);
		// TODO Auto-generated constructor stub
	}




	public Perro(String raza, String nombre, int edad, String sexo, String sonido) {
		super(raza, nombre, edad, sexo);
		this.sonido = sonido;
	}




	@Override
	public String toString() {
		return "Perro [sonido=" + sonido + "]";
	}

	
	

	@Override
	public void emitirSonido() {
		
		System.out.println(" el sonido es guau");
	}
	

}
