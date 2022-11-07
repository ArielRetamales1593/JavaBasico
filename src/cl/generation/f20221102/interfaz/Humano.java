package cl.generation.f20221102.interfaz;

public class Humano  extends Omnivoros implements Generico{

	private boolean razonamiento;

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public Humano() {
		super();
	}

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	} 
	
	
	
	
	
}
