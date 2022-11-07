package cl.generation.f20221027;

public class DatosUsuario {
	
	//atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String correo;
	private Integer telefono;
		
	//constructor vacio
	public DatosUsuario() {
		super();
	}
	
	//constructor con todo
	public DatosUsuario(String nombre, String apelido, Integer edad, String correo, Integer telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apelido;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}

	//getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelido() {
		return apellido;
	}

	public void setApelido(String apelido) {
		this.apellido = apelido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
    //Metodo del objeto
	@Override
	public String toString() {
		return "DatosClienteTarea [nombre=" + nombre + ", apelido=" + apellido + ", edad=" + edad + ", correo="
				+ correo + ", telefono=" + telefono + "]";
	}
	
}

	
	
	
	
	
	
	
	


