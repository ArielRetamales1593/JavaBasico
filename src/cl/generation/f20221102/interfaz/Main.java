package cl.generation.f20221102.interfaz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// no se puede instanciar clases abtractas
		// Animales animal= new Animales ();

		Leon leon = new Leon();
		leon.setAltura(1.76f);
		leon.setPeso(200f);

		leon.comer();

		System.out.println("altura " + leon.getAltura());
		System.out.println("peso " + leon.getPeso());
		System.out.println(leon.toString());

		Ave ave = new Ave();
		ave.setAltura(1.23f);
		ave.setPeso(55f);
		System.out.println(ave.toString());

		ave.comer();

	}

}
