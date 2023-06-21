public class MaiorNumero {
    public static void main(String[] args) {
        int[] numeros = { 10, 5, 8, 20, 3 };
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}
