import java.util.Scanner;

public class SwitchExp {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        String diaSemana = entrada.nextLine();

        String horarioFunc =  switch (diaSemana) { 
            case "seg","ter","qua","qui","sex"  -> "Aberto das 8h às 22h";
            case "sab", "dom" -> "Fechado";
            default -> "Opção inválida!";  
        };

        System.out.printf("Horario de funcionamento: %s%n", horarioFunc);

        entrada.close();         
        
    }
}
