package ejercicioDoce;

public class App {

    public static void main(String[] args) throws Exception {
        int numeroLimite = 20;

        for (int i = 0; i <= numeroLimite; i++) {
            System.out.print(Fibonacci.fibonacciMemoria(i) + " ");
        }
    }
}
