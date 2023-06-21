import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        boolean ehPrimo = true;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        input.close();
    }
}
