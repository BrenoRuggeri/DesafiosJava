import java.util.Scanner;

public class PrimoPar {
    public static void main(String[] args) {

        System.out.println("Digite um número para verificar se ele é par ou impar: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " é par");
        }else{
            System.out.println(num + " é impar");
        }
    }
}