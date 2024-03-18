
No primeiro código do exercício ha um erro de escopo da nossa variável:

/**************************** 1 exemplo com erro de Escopo**************************\
import java.util.Scanner;

public class Escopo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Preço do produto: ");
        double precoProduto = entrada.nextDouble();

        System.out.println("Cobrar frete? ");
        boolean cobrarFrete = entrada.nextBoolean();

        if (cobrarFrete) {
            System.out.println("Valor do frete:");
            double valorFrete = entrada.nextDouble();
        }

        double valorTotal = valorFrete + precoProduto;

        System.out.printf("Valor total: R$ %.2f%n" + valorTotal);

        entrada.close();
    }
}

Já no nosso segundo código, temos um erro de inicialização da nossa variável. Poderiamos adicionar um else que adiciona o valor 0, caso não houvesse frete e assim garantiriamos que nossa variável seria inicializada. Ou atribuimos logo o valor 0 a variável e assim poupamos linhas em nosso código.

/**************************** 2 exemplo com erro de Escopo**************************\

import java.util.Scanner;

public class Escopo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Preço do produto: ");
        double precoProduto = entrada.nextDouble();

        System.out.println("Cobrar frete? ");
        boolean cobrarFrete = entrada.nextBoolean();

        double valorFrete;

        if (cobrarFrete) {
            System.out.println("Valor do frete:");
            valorFrete = entrada.nextDouble();
        }

        double valorTotal = valorFrete + precoProduto;

        System.out.printf("Valor total: R$ %.2f%n" + valorTotal);

        entrada.close();
    }
}

