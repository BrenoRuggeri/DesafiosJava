import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        if (numero < 0){
            System.out.println("Número Negativo !");
        }else{
            System.out.println("Número Positivo !");
        }

    }
}