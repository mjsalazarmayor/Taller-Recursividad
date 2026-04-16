package ejercicioSiete;

public class App {

    public static void main(String[] args) throws Exception {
        double primerNumero = 25;
        double segundoNumero = 100;
        double resultado = MaximoComunDivisor.maximoComunDivisor(primerNumero, segundoNumero);
        System.out.println("El MCD es: "+ resultado);
    }
}
