package ejercicioTres;

/**
 * Leer un valor entero y calcular la sumatoria 1 + ½ +1/3+ … 1/n.
 * Este código tiene una complejidad de O(n)
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */

public class SumaFraccion {

    /**
     * Calcula la suma de la serie 1 + 1/2 + 1/3 + ... + 1/n de forma recursiva.
     * 
     * @param numero
     * @return resultado de la suma de las fracciones
     */
    
    public static double sumaNumero(int numero) {
        if (numero == 1) {
            return 1;
        }
        return 1.0/numero + sumaNumero(numero - 1);
    }
}
