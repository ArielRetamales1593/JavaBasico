package cl.generation.f20221103;



import java.util.ArrayList;

public class Tutorias {

	public static void main(String[] args) {
		// LLamar funcion
		//Descuento();
		System.out.println(Descuento());

		/*
		 * Don José todos los martes y jueves realiza un 20% de descuento en el total de
		 * las compras, crea una función la cual debe recibir un parámetro del día y el
		 * arreglo de valores de los productos a comprar, esta debe retornar el total
		 * final de la compra según corresponda o no descuento.
		 */

	}

	// crear funcion clases
	public static Float Descuento() {
		//crear variable
		String dia  = "martes";
		//Integer descuento;
		Integer totalDescuento = 0;
		Integer totalCompra= 0;
		Float SumaProducto = 0F;
		
		ArrayList<Integer> productos = new ArrayList<Integer>();
		
		productos.add(50);
		productos.add(50);
		productos.add(50);
		productos.add(50);		
		productos.add(50);
	
		
		//condicion debe ser false para que salga
		for (int i = 0; i<productos.size(); i++) {
			//System.out.println(productos.get(i));
			
			SumaProducto = SumaProducto + productos.get(i);
			
			
		}
		
//		for (int i  : productos) {
//			System.out.println(i);
//			
//		}
		
		//condicionales if ,else ,else if 
		if(dia == "martes" || dia == "Martes" || dia=="jueves" || dia=="Jueves") {
			//System.out.println("es martes ");
			SumaProducto = SumaProducto-(SumaProducto*0.20f);
			//System.out.println(SumaProducto);
		
		}
		else {
			//System.out.println("No es martes ni jueves f en el chat ");
			//System.out.println(SumaProducto);
		}
		
		
		//System.out.println("Total de la compra es: "+SumaProducto);
		/*for (Integer producto : productos) {
			System.out.println(producto);
		}*/
		
		
		return SumaProducto;
		
	}
	
	

}
