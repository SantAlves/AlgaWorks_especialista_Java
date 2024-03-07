Int (inteiro):

O tipo int é usado para armazenar números inteiros com um tamanho de 4 bytes. 
Ele pode representar valores no intervalo de -2.147.483.648 a 2.147.483.647.

Exemplo de declaração e inicialização de uma variável int:



public class ExemploInt {
    public static void main(String[] args) {
        int idade = 30; // Exemplo: idade de uma pessoa
        System.out.println("Idade: " + idade);
    }
}

//////////////////////////////////////////////

Long (longo):

O tipo long é usado para armazenar números inteiros maiores, com um tamanho de 8 bytes. 
Ele pode representar valores no intervalo de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.

Exemplo de declaração e inicialização de uma variável long:


public class ExemploLong {
    public static void main(String[] args) {
        long populacaoMundial = 7_900_000_000L; // Exemplo: população mundial estimada
        System.out.println("População mundial: " + populacaoMundial);
    }
}

///////////////////////////////////////////////////////

L no final:

Quando declaramos um valor como long, é importante indicar explicitamente que ele é do tipo long. Para fazer isso, usamos o sufixo L (letra maiúscula “L”) no final do número.

Por exemplo, em 7_900_000_000L, o L indica que esse valor é um long.

Já o _ entre os números:

O caractere _ (sublinhado) é usado para melhorar a legibilidade de números longos. Ele não afeta o valor do número, mas torna mais fácil para os humanos lerem grandes quantidades.

No exemplo, 7_900_000_000L, o _ separa os dígitos em grupos de três, facilitando a leitura: 7 bilhões e 900 milhões.

Aqui está o mesmo exemplo sem o _ para comparação:

long populacaoMundial = 7900000000L;

Obs: O uso do _ é opcional, mas é uma prática comum para tornar o código mais claro.
