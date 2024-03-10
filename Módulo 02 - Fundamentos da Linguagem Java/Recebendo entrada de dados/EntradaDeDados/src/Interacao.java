import java.util.Scanner;

public class Interacao {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        /*  Nesse código podemos perceber um erro causado pelo nextLine. */
        
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Agora, seu nome:");
        String nome = entrada.nextLine();
        System.out.printf("Olá %s. Voce tem %d \n\n", nome, idade);

        entrada.close();

    }
}
