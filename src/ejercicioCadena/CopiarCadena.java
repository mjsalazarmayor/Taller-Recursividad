package ejercicioCadena;

/**
 * Realizar un programa que permita copiar una cadena en otra.
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class CopiarCadena {

    /**
     * Método recursivo para copiar una cadena
     * @param fuente La cadena original a copiar
     * @param indice El índice actual de procesamiento
     * @return Una nueva cadena con los mismos caracteres
     */
    public static String copiarRecursivo(String fuente, int indice) {
        // Caso base: si llegamos al final de la cadena original
        if (indice == fuente.length()) {
            return "";
        }
        
        return fuente.charAt(indice) + copiarRecursivo(fuente, indice + 1);
    }
}
