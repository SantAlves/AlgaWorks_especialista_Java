import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        char tipoNotaFiscal;
        double totalFaturado = 1200.00;
        
        System.out.println("Digite o tipo de nota fiscal: (S) para serviços e (P) para produtos:  ");
        tipoNotaFiscal = entrada.next().charAt(0);

        double valorImpostos = tipoNotaFiscal == 'S' ? totalFaturado * 0.10: totalFaturado * 0.20;

        /*  
         * if (tipoNotaFiscal == 'S') {
         *  valorImpostos = totalFaturado * 0.10 
         * } else {
         * valorImpostos = totalFaturado * 0.20
         * }
         
         */
        
        System.out.printf("Valor total faturado: R$ %.2f%n",totalFaturado);
        System.out.printf("Valor do imposto: R$ %.2f%n",valorImpostos);

        entrada.close();
    }
}
