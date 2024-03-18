import java.util.Scanner;

public class Escopo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Preço do produto: ");
        double precoProduto = entrada.nextDouble();

        System.out.println("Cobrar frete? ");
        boolean cobrarFrete = entrada.nextBoolean();

        double valorFrete = 0;

        if (cobrarFrete) {
            System.out.println("Valor do frete:");
            valorFrete = entrada.nextDouble();
        }

        double valorTotal = valorFrete + precoProduto;

        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

        entrada.close();
    }
}
