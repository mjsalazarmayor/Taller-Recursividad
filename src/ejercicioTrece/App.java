package ejercicioTrece;

public class App {

    public static void main(String[] args) throws Exception {

        int m = 3;
        int n = 2;
        int resultado = Ackerman.calcularFuncionAckerman(m, n);
        
        System.out.println("El resultado de la funcion Ackerman es: " + resultado);
    }
}
