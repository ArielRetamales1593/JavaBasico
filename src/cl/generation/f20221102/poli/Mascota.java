package cl.generation.f20221102.poli;

public class Mascota {

	

	private String raza ; 
	private String nombre;
	private int edad;
	private String sexo ;
	
	public Mascota() {
		super();
	}

	public Mascota(String raza, String nombre, int edad, String sexo) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	
	
	
	
	
	
	
	
	
	
//	getters y setters 
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	} 
	
	
	public void emitirSonido() {
		
		System.out.println(" el sonido es ...");
	}
	
	
	public void horasSiesta() {
		System.out.println("la mascota  no duerme");
		
		
	}
	public void horasSiesta(int horas) {
		System.out.println("la mascota duerme  "+ horas + "hrs");
		
	
	}
	
	public void horasSiesta(float horas) {
		System.out.println("la mascota duerme "+ horas+ "hrs");
	}
	
	
	
}
