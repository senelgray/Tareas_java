package pruebaTres;

import java.util.Scanner;

public class areaCirculo {

	public static void main (String [] arg){
		Scanner scanner = new Scanner (System.in);
		double radio, diametro;
		
		System.out.println("Seleccione una opcion para calcular area de circulo ");
		System.out.println("1. Ingresar radio");
		System.out.println("2. Ingrese el diametro");
		
		int opcion = scanner.nextInt();
		
		if(opcion == 1) {
			System.out.println("Ingrese el radio del circulo: ");
			radio = scanner.nextDouble();
            calcularArea(radio);
		
		}else if (opcion == 2) {
			System.out.println("Ingrese el diametro del circulo: ");
			diametro = scanner.nextDouble();
			radio = diametro/2.0;
			calcularArea(radio);
		}else {
			System.out.println("Opcion invalida. Seleccione 1 o 2.");	
		}
	}
	
	public static void calcularArea(double radio) {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);		
	}
	}	