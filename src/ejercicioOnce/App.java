package ejercicioOnce;

public class App {

    public static void main(String[] args) throws Exception {
        int[][] matriz = {{6, 3, 2}, {8, 4, 2}};
        double resultado = SumaMatriz.sumaMatriz(matriz, 0, 0);
        System.out.println("La suma de la matriz es: " + resultado);
    }
}
