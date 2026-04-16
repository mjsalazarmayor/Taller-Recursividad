package ejercicioSeis;

/**
 * Leer un número llamado base y otro exponente y calcular la potencia elevando
 * la base al exponente.
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */

public class Potencia {

    /**
     * Calcula la potencia de una base elevada a un exponente de forma
     * recursiva.
     *
     * @param base
     * @param exponente número entero no negativo
     * @return resultado de base elevado al exponente
     */
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            throw new IllegalArgumentException("El exponente no puede ser negativo");
        }
        return base * calcularPotencia(base, exponente - 1);
    }
}
