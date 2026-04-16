package ejercicioTrece;

/**
 * La función de Ackerman se define como: Ackerman(m, n) = n + 1 si m = 0
 * Ackerman(m, n) = Ackerman(m - 1, 1) si m > 0 y n = 0 Ackerman(m, n) =
 * Ackerman(m - 1, Ackerman(m, n - 1)) si m > 0 y n > 0 Ej. Si se tiene
 * Ackermann(1, 2) = 4; Ackermann(3, 2) = 29 Realice un programa para encontrar
 * el valor de lfuncion de Ackerman, para dos valores enteros m,n.
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class Ackerman {

    /**
     * Calcula la función de Ackerman para dos valores enteros usando recursión.
     *
     * @param m primer valor entero
     * @param n segundo valor entero
     * @return resultado de la función de Ackerman
     */
    public static int calcularFuncionAckerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return calcularFuncionAckerman(m - 1, 1);
        }
        return calcularFuncionAckerman(m - 1, calcularFuncionAckerman(m, n - 1));
    }
}
