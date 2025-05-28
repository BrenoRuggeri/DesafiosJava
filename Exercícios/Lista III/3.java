import java.util.Scanner;

public class Subtração {
    public static void main(String[] args) {

        System.out.println("Digite (1) para calcular a área do quadrado " +
                "ou (2) para calcular a área do circulo: ");
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o tamanho do lado do quadrado:");
                int lado = input.nextInt();
                int areaQuadrado = lado * lado;
                System.out.println("O area do quadrado é: " + areaQuadrado);
                break;

                case 2:
                    System.out.println("Digite o valor do raio do circulo:");
                    int raio = input.nextInt();
                    double pi = 3.14;
                    double areaCirculo = pi * raio * raio;
                    System.out.println("O area do circulo é: " + areaCirculo + "cm²");
                    break;
                    default:
                        System.out.println("Opção invalida");
                        break;
        }
    }
}