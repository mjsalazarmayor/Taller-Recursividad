package ejercicioOcho;

public class App {

    public static void main(String[] args) throws Exception {
        double primerNumero = 3;
        double segundoNumero = 15;
        double resultado = CalculoCociente.calcularCociente(primerNumero, segundoNumero);
        System.out.println("El cociente de la división es: "+ resultado);
    }
}