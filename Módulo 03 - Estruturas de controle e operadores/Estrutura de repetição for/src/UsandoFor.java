import java.util.Scanner;

public class UsandoFor {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o peso máximo suportado pela Aeronave: ");
        int pesoMaximo = entrada.nextInt();

        System.out.println("Digite a quantidade total de passageiros: ");
        int totalPassageiros = entrada.nextInt();

        System.out.printf("Limite máximo suportado: %dKg %n", pesoMaximo);

        int pesoTotalPassageiros = 0;

        for (int i = 1; i <= totalPassageiros; i++) {
            System.out.println("Digite o peso do passageiro " + i + ": ");
            int pesoPassageiro = entrada.nextInt();

            pesoTotalPassageiros += pesoPassageiro;
        }

        System.out.printf("Peso total dos passageiros: %dKg%n", pesoTotalPassageiros);
        System.out.printf("Situação da Aeronave: %s%n", pesoTotalPassageiros > pesoMaximo ? "Peso excedido! não pode decolar!" : "Liberado para decolar!");
        entrada.close();
    }
}
