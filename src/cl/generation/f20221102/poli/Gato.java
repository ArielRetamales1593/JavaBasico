package cl.generation.f20221102.poli;

public class Gato extends Mascota {

	private String sonido ;

	
	
	
	public Gato() {
		super();
	}




	public Gato(String sonido) {
		super();
		this.sonido = sonido;
	}



	
	
	
	
	

	public Gato(String raza, String nombre, int edad, String sexo) {
		super(raza, nombre, edad, sexo);
		// TODO Auto-generated constructor stub
	}




	public String getSonido() {
		return sonido;
	}




	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + "]";
	}




	@Override
	public void emitirSonido() {
		
		System.out.println(" el sonido es miau ");
	}
	
	
}
