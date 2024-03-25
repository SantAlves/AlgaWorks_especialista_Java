As **cláusulas `break` e `continue`** são recursos importantes na linguagem de programação **Java**. Vamos explorar o que são, como funcionam e suas aplicações:

1. **`break`**:

    - **Para que serve**:

        - O comando `break` é usado para **interromper** a execução de um laço (como `while`, `for` ou `do ... while`) ou um bloco `switch`.

        - Quando o Java encontra o comando `break`, ele **sai imediatamente** do laço ou estrutura de controle atual.

    - **Benefícios e Vantagens**:

        - Permite **maior controle** sobre o fluxo do programa.

        - Útil quando queremos **encerrar** um loop assim que uma condição específica é atendida.

        - Evita a execução desnecessária de iterações restantes.

    - **Exemplo**:

        ============================ java ==================================
        public class BreakExample {
            public static void main(String[] args) {
                for (int i = 1; i <= 1000000; i++) {
                    if ((i % 17 == 0) && (i % 19 == 0)) {
                        System.out.println(i);
                        break; // Interrompe o loop quando a condição é atendida
                    }
                }
            }
        }
        ```
        - Neste exemplo, o programa procura o menor número entre 1 e 1 milhão que seja múltiplo de 17 e 19 ao mesmo tempo. Assim que encontra o primeiro número, o loop é interrompido.

2. **`continue`**:

    - **Para que serve**:

        - O comando `continue` é usado para **pular** o restante do código dentro de uma iteração atual de um loop.

        - Após executar o `continue`, o loop **continua** com a próxima iteração.

    - **Benefícios e Vantagens**:

        - Útil quando queremos **ignorar** parte do código dentro de um loop sem sair completamente dele.

        - Permite pular iterações indesejadas.

    - **Exemplo**:

        ============================== java ===================================
        public class ContinueExample {
            public static void main(String[] args) {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0) {
                        continue; // Pula a iteração se i for par
                    }
                    System.out.println("Número ímpar: " + i);
                }
            }
        }
        ```
        - Neste exemplo, o programa imprime apenas os números ímpares de 1 a 10, pulando os números pares.

Em resumo, essas cláusulas são ferramentas poderosas para controlar o fluxo de execução em Java, tornando nossos programas mais eficientes e legíveis. 🚀

