package pruebaTres;

import java.util.Scanner;

public class areaRectangulo {

	public static void main (String [] arg){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingrese los valores de la altura y base para calcular el area del rectangulo ");
	
		System.out.println("Ingrese la base del rectangulo: ");
		int numero1 = input.nextInt();
	
		System.out.println("Ingrese la altura del rectangulo: ");
		int numero2 = input.nextInt();
		
		while (numero1 == numero2) {

            System.out.println("Los números son iguales. Inténtelo nuevamente.");
            System.out.println("Ingrese la base del rectangulo: ");
    		numero1 = input.nextInt();
    	
    		System.out.println("Ingrese la altura del rectangulo: ");
    		 numero2 = input.nextInt();
		}
		int baseRec = numero1*numero2;
		
		System.out.println("La base del rectangulo es: " +baseRec);
		
		
	}	
}