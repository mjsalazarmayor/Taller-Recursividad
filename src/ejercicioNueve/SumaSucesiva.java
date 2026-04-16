package ejercicioNueve;

/**
 * Leer 2 números enteros y realizar la multiplicación de los 2 números mediante
 * sumas sucesivas.
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class SumaSucesiva {

    /**
     * Realiza la multiplicación de dos números mediante sumas sucesivas de
     * forma recursiva.
     *
     * @param primerNumero número que se suma repetidamente
     * @param segundoNumero cantidad de veces que se suma
     * @return resultado de la multiplicación
     */
    
    public static double sumaSucesiva(double primerNumero, double segundoNumero) {
        if (segundoNumero == 0) {
            return 0;
        }
        return primerNumero + sumaSucesiva(primerNumero, segundoNumero - 1);
    }
}
