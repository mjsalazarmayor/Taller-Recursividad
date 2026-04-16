package ejercicioDoce;

/**
 * La serie de Fibonacci puede definirse en términos recursivos asi: (1) Fib(1)
 * = 1 ; Fib(0) = 0 (2) Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2. Lea un valor
 * entero que representa el limite de la serie e imprimala hasta el valor
 * limite.
 *
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class Fibonacci {

    /**
     * Calcula el número de Fibonacci en la posición indicada usando recursividad.
     *
     * @param numeroLimite posición dentro de la serie
     * @return valor de Fibonacci en esa posición
     */
    public static int serieFinonacci(int numeroLimite) {
        if (numeroLimite == 1) {
            return 1;
        } else if (numeroLimite == 0) {
            return 0;
        }
        return serieFinonacci(numeroLimite - 1) + serieFinonacci(numeroLimite - 2);
    }
}
