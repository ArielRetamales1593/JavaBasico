package cl.generation.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
//		POLIMORFISMO

//		instancia de las clases 

		Mascota mascota = new Mascota();

		mascota.emitirSonido();

		Perro dago = new Perro();

		dago.emitirSonido();

		Gato bjork = new Gato();

		bjork.emitirSonido();

//		#####################POLIMORFISMO###############################
		Mascota ema = new Perro();
		ema.emitirSonido();

		Mascota michi = new Gato();
		michi.emitirSonido();

//		POLIMORFISMO.......... DEBE EXISTIR HERENCIA , JERARQUIA DE CLASES
//		UNA SUPERCLASE SE COMPORTA COMO UNA CLASE HIJA PERO !NO ES UNA CLASE HIJA

		ema.horasSiesta(8);

	}

}
