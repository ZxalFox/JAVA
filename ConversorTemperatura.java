import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        input.close();
    }
}
