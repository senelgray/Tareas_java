package pruebaTres;
import java.util.Scanner;


public class temperaturaCambio {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.println("4. Fahrenheit a Kelvin");
        System.out.println("5. Kelvin a Celsius");
        System.out.println("6. Kelvin a Fahrenheit");

        int opcion = scanner.nextInt();

        double resultado = 0.0;

        switch (opcion) {
            case 1:
                resultado = celsiusFahrenheit(temperatura);
                break;
            case 2:
                resultado = celsiusKelvin(temperatura);
                break;
            case 3:
                resultado = fahrenheitCelsius(temperatura);
                break;
            case 4:
                resultado = fahrenheitKelvin(temperatura);
                break;
            case 5:
                resultado = kelvinCelsius(temperatura);
                break;
            case 6:
                resultado = kelvinFahrenheit(temperatura);
                break;
            default:
                System.out.println("Opcion invalida. Seleccione una opcion del 1 al 6");
                return;
        }

        System.out.println("El resultado de la conversión es: " + resultado);
    }

    public static double celsiusFahrenheit(double temperatura) {
        return (temperatura * 9 / 5) + 32;
    }

    public static double celsiusKelvin(double temperatura) {
        return temperatura + 273.15;
    }

    public static double fahrenheitCelsius(double temperatura) {
        return (temperatura - 32) * 5 / 9;
    }

    public static double fahrenheitKelvin(double temperatura) {
        return (temperatura + 459.67) * 5 / 9;
    }

    public static double kelvinCelsius(double temperatura) {
        return temperatura - 273.15;
    }

    public static double kelvinFahrenheit(double temperatura) {
        return (temperatura * 9 / 5) - 459.67;
    }
}