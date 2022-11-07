package cl.generation.f20221102;

public class Profesores extends Persona {
	
	
	
	private String asignatura;
	private String cursoAcargo;
	
	
	
	public Profesores() {
		super();
	}



	public Profesores(String asignatura, String cursoAcargo) {
		super();
		this.asignatura = asignatura;
		this.cursoAcargo = cursoAcargo;
	}

	
	
	


	public Profesores(String nombre, String apellido, int edad, String asignatura, String cursoAcargo) {
		super(nombre, apellido, edad);
		this.asignatura = asignatura;
		this.cursoAcargo = cursoAcargo;
	}



	public String getAsignatura() {
		return asignatura;
	}



	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}



	public String getCursoAcargo() {
		return cursoAcargo;
	}



	public void setCursoAcargo(String cursoAcargo) {
		this.cursoAcargo = cursoAcargo;
	}



	@Override
	public String toString() {
		return "Profesores [asignatura=" + asignatura + ", cursoAcargo=" + cursoAcargo + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	

	
	

	public void metodoImprimir() {
		System.out.println("estoy en el metodo de la super clase");
	}

	
	
}
