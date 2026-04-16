package ejercicioSiete;

/**
 * Leer dos números enteros y calcular el máximo común divisor(M.C.D. ),de dos
 * números enteros (M,N) utilizando el algoritmo de Euclides. Si M >= N una
 * función recursiva para MCD es MCD = M si N =0 MCD = MCD (N, M % N) si N <> 0
 *
 * @author Maria Jose Salazar Lopez
 * @version 1.0
 */
public class MaximoComunDivisor {

    /**
     * Calcula el máximo común divisor (MCD) de dos números usando el algoritmo
     * de Euclides.
     *
     * @param primerNumero primer número
     * @param segundoNumero segundo número
     * @return máximo común divisor de ambos números
     */
    
    public static double maximoComunDivisor(double primerNumero, double segundoNumero) {
        double numeroMayor = (primerNumero >= segundoNumero) ? primerNumero : segundoNumero;
        double numeroMenor = (primerNumero < segundoNumero) ? primerNumero : segundoNumero;
        if (numeroMenor == 0) {
            return numeroMayor;
        }
        return maximoComunDivisor(numeroMenor, numeroMayor % numeroMenor);
    }
}
