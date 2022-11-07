package cl.generation.f20221102;

public class Basquebolista extends 	EquipoTecnico {
	
	private float peso;
	private float altura;
	
	
	
	public Basquebolista() {
		super();
	}



	public Basquebolista(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	@Override
	public String toString() {
		return "Basquebolista [peso=" + peso + ", altura=" + altura + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", toString()=" + super.toString()
				+ "]";
	}



	
	
	
	
	

}
