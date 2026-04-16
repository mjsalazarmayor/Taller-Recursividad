package ejercicioDiez;

/**
 * Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los
 * elementos del vector.
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class SumaArreglo {

    /**
     * Suma los elementos de un arreglo de forma recursiva.
     *
     * @param valores arreglo de números enteros
     * @param indice posición actual dentro del arreglo
     * @return suma total de los elementos del arreglo
     */
    public static int sumaArreglo(int[] valores, int indice) {
        if (indice == valores.length) {
            return 0;
        }
        return valores[indice] + sumaArreglo(valores, indice + 1);
    }
}
