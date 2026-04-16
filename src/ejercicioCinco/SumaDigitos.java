package ejercicioCinco;

/**
 * Leer un numero y sumar los dígitos de un número. Ejemplo: Entrada: 123 Resultado:6
 *
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */

public class SumaDigitos {

    /**
     * 
     * Suma los dígitos de un número entero de forma recursiva.
     * 
     * @param numero
     * @param suma acumulador de la suma de los dígitos
     * @return suma total de los dígitos
     */

    public static int sumarDigitos(int numero, int suma) {
        if(numero == 0){
            return suma;
        }
        return sumarDigitos(numero/10, suma + ( numero % 10));
    }
}
