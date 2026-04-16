package ejercicioUno;

/**
 * Leer un numero entero y n calcular la factorial de dicho numero.
 *
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */

public class SumaFactorial {

    /**
     * Calcula el factorial de un número entero de forma recursiva.
     * 
     * @param numero
     * @return resultado del factorial del número
     */

    public static int sumaNumero(int numero) {
        if (numero == 1) {
            return 1;
        }
        return numero * sumaNumero(numero - 1);
    }
}
