Em Java, a atribuição de uma variável de tipo long a uma variável de tipo int pode resultar em perda de informações. Isso ocorre porque o tipo long tem uma faixa de valores maior do que o tipo int. 

Vejamos por que isso acontece:

Motivo da Não Compilação:

Quando você tenta atribuir um valor long a uma variável int, o compilador verifica se o valor cabe dentro da faixa de valores do int.

Se o valor long for maior do que o valor máximo representável pelo int, ocorrerá uma perda de informações, e o código não será compilado.

Solução:

Para resolver esse problema, você pode fazer um casting explícito (conversão de tipo) para converter o valor long em um int.

Use o operador de casting (int) para realizar essa conversão.
Aqui está como você pode fazer isso:

Java

long x = 10L; // Note o sufixo L para indicar que é um long

int y = (int) x; // Realiza o casting de long para int

Agora, o valor de y conterá o valor de x, mas tenha em mente que, se o valor de x for maior do que o valor máximo representável por um int, haverá perda de informações.

O mesmo vale de Double (que é maior que float) para float; Resolver da mesma forma que o exemplo acima;