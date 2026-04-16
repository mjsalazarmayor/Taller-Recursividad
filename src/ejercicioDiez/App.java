package ejercicioDiez;

public class App {

    public static void main(String[] args) throws Exception {
        int[] valores = {5, 3, 6, 7, 2, 5};
        double resultado = SumaArreglo.sumaArreglo(valores, 0);
        System.out.println("La suma del arreglo es: " + resultado);
    }
}
