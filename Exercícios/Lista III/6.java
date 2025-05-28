import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        System.out.println("Digite um número: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= num; i++) {

            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}