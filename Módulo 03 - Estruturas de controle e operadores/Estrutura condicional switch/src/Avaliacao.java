import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Avalie nosso atendimento de 1 a 5: ");
        int avaliacao = entrada.nextInt();

        String descricaoAvaliacao;

        switch (avaliacao) { 
            case 1:
                descricaoAvaliacao = "Muito ruim";
                System.out.println(descricaoAvaliacao);
                break;
            case 2:
                descricaoAvaliacao = "Ruim";
                System.out.println(descricaoAvaliacao);
                break;
            case 3:
                descricaoAvaliacao = "Regular";
                System.out.println(descricaoAvaliacao);
                break;
            case 4:
                descricaoAvaliacao = "Bom";
                System.out.println(descricaoAvaliacao);
                break;
            case 5:
                descricaoAvaliacao = "Excelente";
                System.out.println(descricaoAvaliacao);
                break;
        
            default:
                System.out.println("Opção inválida!");
                break;
        }

        entrada.close();
    }
}
