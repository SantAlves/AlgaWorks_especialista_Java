Primeiro código exemplo. No código do autor, ele não atribuiu o valor null a horarioFunc...mas se eu fizer isso o código dar erro pois havera uma variável sem ser inicializada...

================================= Exemplo 1 =================================================

import java.util.Scanner;

public class SwitchExp {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        String diaSemana = entrada.nextLine();

        String horarioFunc = null;

        switch (diaSemana) { 
            case "seg","ter","qua","qui","sex"  -> horarioFunc = "Aberto das 8h às 22h";
            case "sab", "dom" -> horarioFunc = "Fechado";
            default -> System.out.println("Opção inválida!");  
        }

        System.out.printf("Horario de funcionamento: %s%n", horarioFunc);

        entrada.close();         
        
    }
}
