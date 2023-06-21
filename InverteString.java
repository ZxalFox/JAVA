public class InverteString {
    public static void main(String[] args) {
        String texto = "Hello, World!";
        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);
    }
}
