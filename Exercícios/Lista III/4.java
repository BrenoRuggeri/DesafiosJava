import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        System.out.println("Digite um número de 1 a 10 para exibir a tabuada desse número");
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    int tabuada1 = 1 * i;
                    System.out.println(tabuada1);
                }
                break;

                case 2:
                    for (int i = 1; i <= 10; i++) {
                        int tabuada2 = 2 * i;
                        System.out.println(tabuada2);
                    }
                    break;

                    case 3:
                        for (int i = 1; i <= 10; i++) {
                            int tabuada3 = 3 * i;
                            System.out.println(tabuada3);
                        }
                        break;

                        case 4:
                            for (int i = 1; i <= 10; i++) {
                                int tabuada4 = 4 * i;
                                System.out.println(tabuada4);
                            }
                            break;

                            case 5:
                                for (int i = 1; i <= 10; i++) {
                                    int tabuada5 = 5 * i;
                                    System.out.println(tabuada5);
                                }
                                break;

                                case 6:
                                    for (int i = 1; i <= 10; i++) {
                                        int tabuada6 = 6 * i;
                                        System.out.println(tabuada6);
                                    }
                                    break;

                                    case 7:
                                        for (int i = 1; i <= 10; i++) {
                                            int tabuada7 = 7 * i;
                                            System.out.println(tabuada7);
                                        }
                                        break;

                                        case 8:
                                            for (int i = 1; i <= 10; i++) {
                                                int tabuada8 = 8 * i;
                                                System.out.println(tabuada8);
                                            }
                                            break;

                                            case 9:
                                                for (int i = 1; i <= 10; i++) {
                                                    int tabuada9 = 9 * i;
                                                    System.out.println(tabuada9);
                                                }
                                                break;

                                                case 10:
                                                    for (int i = 1; i <= 10; i++) {
                                                        int tabuada10 = 10 * i;
                                                        System.out.println(tabuada10);
                                                    }
                                                    break;

                    default:
                        System.out.println("Opção invalida");
                        break;
        }
    }
}