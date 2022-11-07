package cl.generation.f20221102.interfaz;

public class Leon extends Carnivoro implements Generico {

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Come carne");
	}

	@Override
	public String toString() {
		return "Leon [getAltura()=" + getAltura() + ", getPeso()=" + getPeso() + "]";
	}

	
	
	
	
}
