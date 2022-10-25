package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array en java
		// arreglos estaticos, no cambian de tamaño
		//

//		int[] arreglo1 = new int[3]; // se define nombre del arreglo y
		// arreglo.length; //tamaño del arreglo;
		// agregar datos

//		arreglo1[0] = 1;
//		arreglo1[1] = 2;
//		arreglo1[2] = 3;

//		System.out.println(arreglo1.toString());
//		System.out.println(Arrays.toString(arreglo1));
//		System.out.println(arreglo1[2]);

//		String [] vocales= {"a","e","i","o","u"} ;
////		se pueden sobrescribir ej vocales[1] = "n"
//		
//		System.out.println( " el tamaño es " + vocales.length);
//		
//		

//		crear un array de numero flotantes de tamaño 6

//		float[] numeros = new float[6];
//
//		numeros[0] = 2.5f;
//		numeros[1]= 13.56f;
//
//		System.out.println(numeros);
//
//		
//		
//////		enteros y float= castear puede perder datos .... 
////		int[] enteros = new int[2];
////		enteros[0]= (int) 2.5f;
////		System.out.println(enteros[0]);
////		
//		
//		int[] numeros1=new int [100];
//		
//	
//		//{100,99,98,97...0}
//		for(int i =numeros1.length; i>0 ;i--) {
//			numeros1[numeros1.length - i]= i;
//			
//		}
//
//System.out.println(Arrays.toString(numeros1));
//		
		//ejemplos de arreglos estaticos 
		

		int[] numeros = { 1, 4, 5, 6, -1, -51, 2, 16, -123, 100 };

		int numMax = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			if (numMax < numeros[i]) {
				numMax = numeros[i];
			}
		}

		System.out.println(numMax);

		int[] numeros1 = { 1, 4, 5, 6, -1, -51, 2, 16, -123, 100 };

		int numMin = numeros[0];

		for (int j = 0; j < numeros.length; j++) {

			if (numMin > numeros[j]) {
				numMin = numeros[j];
			}

		}
		System.out.println(numMin);

		
		
		
		
		
		for(int j = 0 ; j<numeros.length;j++ ){

			if(numMin>numeros[j] ){
			numMin=numeros[j];
			}}
		
		
		
		
		
		
		

int[] numeroInt = {-3,-5, 4,12, 3,35, -35,77,-1,0};
int numeroMax = 0;
int numeroMin = 0;

	for (int i = 0; i < numeroInt.length; i++){
    if(numeroInt[i] > numeroMax){ //12 > 4
      numeroMax = numeroInt[i]; //numeroMax = 4
    }
    if(numeroInt[i] < numeroMin){
      numeroMin = numeroInt[i];
    }
  }
System.out.println(numeroMax);
System.out.println(numeroMin);

//El mismo arreglo crear otros 2 arreglos, 
//uno con solo los pares y otro arreglo solo con los impares.

int[] impares = new int [numeroInt.length];
int[] pares = new int [numeroInt.length];
//impares: 
for (int i = 0; i < numeroInt.length; i++){
  	if(numeroInt[i] %2 == 0){ //obtenemos el par
      pares[i] = numeroInt[i]; //{0,0,4,12,0,0,0,0,0,0}
    }else{
      impares[i] = numeroInt[i]; //{-3,-5,0,0,3,35,-35,77,-1,0}
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
























