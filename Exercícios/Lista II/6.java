public class Desconto {
    public static void main(String[] args) {

        double precoOriginal = 55.50;
        double percentualDesconto = 0.1;
        double precoFinal = precoOriginal *  percentualDesconto;
        System.out.println("O valor com desconto de 10% é: "+ (precoOriginal-precoFinal));
    }
}