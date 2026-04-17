package ejercicioDoce;

/**
 * La serie de Fibonacci puede definirse en términos recursivos asi: (1) Fib(1)
 * = 1 ; Fib(0) = 0 (2) Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2. Lea un valor
 * entero que representa el limite de la serie e imprimala hasta el valor
 * limite.
 * 
 * Este código tiene una complejidad de O(n)
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class Fibonacci {

    private static int[] memoria;

     /**
     * Prepara el entorno para el cálculo de Fibonacci.
     * 
     * @param n la posición en la serie a calcular
     * @return el valor de Fibonacci en la posición n.
     */

    public static int fibonacciMemoria(int n) {
        memoria = new int[n + 1];
        return calcularSerieFibonacci(n);
    }

    /**
     * Calcula el número de Fibonacci de forma recursiva eficiente.
     * 
     * @param n posición actual a calcular
     * @return posición n.
     */

    private static int calcularSerieFibonacci(int n) {
        if (n <= 1)
            return n;

        if (memoria[n] != 0)
            return memoria[n];

        memoria[n] = calcularSerieFibonacci(n - 1) + calcularSerieFibonacci(n - 2);
        return memoria[n];
    }

}
