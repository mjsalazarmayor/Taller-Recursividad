package ejercicioDos;

/**
 * Leer un número entero y calcular la sumatoria hasta el numero leído.
 * Este código tiene una complejidad de O(n)
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */

public class SumatoriaNumero {

    /**
     * Calcula la sumatoria de los números desde 1 hasta el valor dado de forma recursiva.
     * 
     * @param numero
     * @return suma total desde 1 hasta el número
     */

    public static int sumaNumero(int numero) {
        if (numero == 1) {
            return 1;
        }
        return numero + sumaNumero(numero - 1);
    }
}
