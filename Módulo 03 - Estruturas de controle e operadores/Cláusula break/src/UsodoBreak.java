import java.util.Scanner;

public class UsodoBreak {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite um dia da semana: ");
        String diaSemana = entrada.nextLine();

        String horarioFun;

        switch (diaSemana) { 
            case "seg":  
            case "ter":
            case "qua": 
            case "qui":  
            case "sex":
                horarioFun = "Aberto das 8h às 22h";
                System.out.println(horarioFun);
                break;
            case "sab": 
            case "dom":
                horarioFun = "Fechado";
                System.out.println(horarioFun);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        entrada.close();
    }
}
