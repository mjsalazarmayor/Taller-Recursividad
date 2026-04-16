package ejercicioCuatro;

/**
 * Leer un número entero e invertirlo. Ejemplo: Entrada: 123 Salida: 321
 *
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */

public class Invertido {

    /**
     * 
     * Invierte los dígitos de un número entero de forma recursiva.
     * 
     * @param numero número original
     * @param invertido número invertido acumulado
     * @return número con sus dígitos invertidos
     */

    public static int invertirNumero(int numero, int invertido) {
        if(numero == 0){
            return invertido;
        }
        return invertirNumero(numero/10, invertido * 10 + ( numero % 10));
    }
}
