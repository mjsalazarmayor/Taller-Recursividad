package ejercicioSeis;

public class App {

    public static void main(String[] args) throws Exception {
        int base = 4;
        int exponente = 5;
        int resultado = Potencia.calcularPotencia(base, exponente);
        System.out.println("La potencia del numero es: " + resultado);
    }
}
