package ejercicioCadena;

public class App {

    public static void main(String[] args) throws Exception {
        String original = "Hola mundo";
        // Llamada inicial al método recursivo
        String copia = CopiarCadena.copiarRecursivo(original, 0);
        
        System.out.println("Original: " + original);
        System.out.println("Copia: " + copia);
    }
}
