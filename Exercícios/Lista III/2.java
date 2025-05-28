import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scan.nextInt();

        if(numero > numero2) {
            System.out.println("O numero: " + numero + " é maior que o numero: " + numero2);
        }else if (numero < numero2) {
            System.out.println("O numero: " + numero + " é menor que o numero: " + numero2);
        }else if (numero2 > numero) {
            System.out.println("O numero: " + numero2 + " é maior que o numero: " + numero);
        }else if (numero2 < numero) {
            System.out.println("O numero : " + numero2 + " é menor que o numero: " + numero);
        }else{
            System.out.println("São iguais");
        }
    }
}