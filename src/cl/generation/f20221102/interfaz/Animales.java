package cl.generation.f20221102.interfaz;

public  abstract class Animales {  // no se puede instanciar/ Crear .......

	
	private float altura;
	private float peso ;
	
	
	public Animales() {
		super();
	}


	public Animales(float altura, float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	
	
	
	

	public abstract void metodoAnimal() ; // solo se define el metodo y 
//	se implementa donde se hereda esa clase 
		
	
	
	
	
}
