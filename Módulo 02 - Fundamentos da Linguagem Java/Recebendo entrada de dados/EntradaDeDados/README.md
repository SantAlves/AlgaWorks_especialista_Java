## Erro de nextLine

O erro comum envolvendo o método nextLine() em Java está relacionado à interação com outros métodos de entrada, como nextInt(). Vamos entender por que isso acontece e como resolver:
- Causa do Erro:
    - O método nextInt() lê um número inteiro da entrada, mas não consome o caractere de quebra de linha (\n).
    - Quando você chama nextLine() após nextInt(), ele consome o restante da linha, incluindo o caractere de quebra de linha.
    - Isso faz com que o programa pule para a leitura da próxima linha, resultando em comportamento inesperado.
- Soluções:
    - Existem algumas maneiras de resolver esse problema:
a. Consumir o Caractere de Quebra de Linha:
        - Logo após o nextInt(), adicione uma chamada a nextLine() para consumir o caractere de quebra de linha restante:

Scanner scan = new Scanner(System.in);
int i = scan.nextInt();
scan.nextLine(); // Consumir o \\n após o nextInt()
String a = scan.nextLine();

b. Converter a Entrada Diretamente para Inteiro:
        - Leia a linha completa como uma string e converta-a para um inteiro usando Integer.parseInt():

Scanner scan = new Scanner(System.in);
String inputLine = scan.nextLine();
int i = Integer.parseInt(inputLine);

c. Usar hasNextLine():
        - Verifique se há uma linha na entrada antes de chamar nextLine():

Scanner scan = new Scanner(System.in);
int i = scan.nextInt();
if (scan.hasNextLine()) {
    String a = scan.nextLine();
}

- Exemplo Completo:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine(); // Consumir o \\n após o nextInt()
        System.out.println("Digite a string a:");
        String a = scan.nextLine();
        System.out.println("Digite a string b:");
        String b = scan.nextLine();
        // Resto do código...
    }
}

Lembre-se de que o uso correto do nextLine() após nextInt() é essencial para evitar comportamentos inesperados em seu programa Java   .