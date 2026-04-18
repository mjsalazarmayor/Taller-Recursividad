package ejercicioOcho;

/**
 * Leer 2 números enteros y calcular el cociente de la división entera.
 * (sugerencia: use restas sucesivas)
 * 
 * Este código tiene una complejidad de O(n)
 * 
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class CalculoCociente {

    /**
     * Calcula el cociente de una división entera usando restas sucesivas.
     *
     * @param primerNumero número a dividir
     * @param segundoNumero número divisor
     * @return cociente de la división
     */
    public static double calcularCociente(double primerNumero, double segundoNumero) {
        double numeroMayor = (primerNumero >= segundoNumero) ? primerNumero : segundoNumero;
        double numeroMenor = (primerNumero < segundoNumero) ? primerNumero : segundoNumero;
        if (numeroMenor == 0) {
            return 0;
        }
        return restaSucesiva(numeroMayor, numeroMenor, 0);
    }

    /**
     * Realiza la división mediante restas sucesivas acumulando el cociente.
     *
     * @param dividendo número que se va reduciendo
     * @param divisor número que se resta
     * @param cociente contador del resultado
     * @return cociente final
     */
    public static double restaSucesiva(double dividendo, double divisor, int cociente) {
        if (dividendo == 0) {
            return cociente;
        }
        return restaSucesiva(dividendo - divisor, divisor, cociente + 1);
    }
}
