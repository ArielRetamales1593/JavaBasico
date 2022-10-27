package cl.generation.f20221027;

public class Auto {
	
	//atributos 
	private String marca; // donfeng
	private String color; //"negro"
	private String modelo; // nuñuki
	private Float cilindrada;// 1,6- 2,8
	private Float rendimiento; // 10,5 km/l
	
	
      // constructor vacio
	 // nos permite instanciar al objeto 
	//inicializar los atributos	
	public Auto() {
		super();
	}
  
//	constructor con datos
	
	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
	}




	// GETTERS Y SETTERS(ACCESADOR Y MUTADOR)
	

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Float getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}


	public Float getRendimiento() {
		return rendimiento;
	}


	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}
	
	
	

//	METODOS DEL OBJETO 
	

public void avanzar() {
	
	System.out.println("Estoy dentro del avanzar");
	
	
}




@Override
public String toString() {
	return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
			+ ", rendimiento=" + rendimiento + "]";
}
	
	
	
	
}
