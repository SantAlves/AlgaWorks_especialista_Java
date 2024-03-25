import java.util.Scanner;

public class FazerEnquanto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int quantidadeNumeros = 0;
        String numerosEscolhidos =  " ";
        int numeroAtual = 1;
       
        System.out.println("Digite a quantidade de numeros que deseja apostar: ");
        quantidadeNumeros = sc.nextInt();
        do {
            System.out.printf("Numero %d/%d%n", numeroAtual, quantidadeNumeros);
            int numeroEscolhido = sc.nextInt();

            if (numeroEscolhido < 0 || numeroEscolhido > 60) {
                System.out.println("Numero invalido, só pode entre 1 e 60");
            }else {
                numerosEscolhidos += numeroEscolhido + " ";
                numeroAtual++;
            }
            
        } while(numeroAtual <= quantidadeNumeros);

        System.out.printf("Numeros escolhidos: %s%n", numerosEscolhidos);

        sc.close();
    }
}
