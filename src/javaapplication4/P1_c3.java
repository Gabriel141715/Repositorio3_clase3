
package javaapplication4;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class P1_c3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario el segundo número
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Calcular la suma
        int suma = numero1 + numero2;

        // Calcular el promedio
        double promedio = (double) suma / 2;

        // Mostrar los resultados
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);

        // Cerrar el scanner
        scanner.close();
    }
}
