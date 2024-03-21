import java.util.Scanner;

public class EstruturaWhile {
     public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o peso máximo suportado pela Aeronave: ");
        int pesoMaximo = entrada.nextInt();


        int pesoTotalPassageiros = 0;
        boolean incluirNovoPa = true;


        System.out.printf("Limite máximo suportado: %dKg %n", pesoMaximo);


        while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPa) {
            
            System.out.println("Digite o peso do passageiro: ");
            int pesoPassageiro = entrada.nextInt();

            pesoTotalPassageiros += pesoPassageiro;

            System.out.println("Incluir novo passageiro? ");
            incluirNovoPa = entrada.nextBoolean();
        } 

        System.out.printf("Peso total dos passageiros: %dKg%n", pesoTotalPassageiros);
        System.out.printf("Situação da Aeronave: %s%n", pesoTotalPassageiros > pesoMaximo ? "Peso excedido! não pode decolar!" : "Liberado para decolar!");
        entrada.close();
    }
}
