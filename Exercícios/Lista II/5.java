public class ConversaoDolar {
    public static void main(String[] args) {

        double valorEmDolares = 10.0;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.printf("O resultado da conversão é: R$ %.2f\n", valorEmReais);
    }
}