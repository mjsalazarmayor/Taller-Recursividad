package ejercicioOnce;

/**
 * Cree una matriz de tamaño mXn y sume los elementos de la matriz.
 *
 * Este código tiene una complejidad de O(n^2)
 * 
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class SumaMatriz {

    /**
     * Suma todos los elementos de una matriz de forma recursiva.
     *
     * @param matriz matriz de enteros
     * @param filas índice actual de fila
     * @param columnas índice actual de columna
     * @return suma total de los elementos de la matriz
     */
    public static int sumaMatriz(int[][] matriz, int filas, int columnas) {
        if (filas == matriz.length) {
            return 0;
        }
        if (columnas == matriz[0].length) {
            return sumaMatriz(matriz, filas + 1, 0);
        }
        return matriz[filas][columnas] + sumaMatriz(matriz, filas, columnas + 1);
    }
}
