## Qual a finalidade e como usar O Jshell no Java


O JShell é uma ferramenta poderosa que chegou ao Java na versão 9. Ele é um REPL (Read-eval-print-loop), o que significa que você pode executar instruções interativamente e ver os resultados imediatamente. Vamos explorar como usar o JShell no Ubuntu:
- O que é o JShell?
    - O JShell é um ambiente interativo onde você pode digitar e executar código Java sem a necessidade de criar classes ou métodos.
    - Ele é útil para testar rapidamente trechos de código, experimentar novos recursos da linguagem e aprender a sintaxe do Java.
- Como instalar o JShell no Ubuntu:
    - Primeiro, verifique se você tem o Java Development Kit (JDK) instalado. Se não, instale-o:

sudo apt update
sudo apt install default-jdk

    - Agora, você pode usar o JShell. Abra um terminal e digite:

jshell

    - Isso iniciará o ambiente interativo do JShell.
- Comandos Básicos do JShell:
    - Digite expressões Java diretamente no prompt e pressione Enter para ver os resultados.
    - Você pode criar variáveis, métodos e até mesmo classes no JShell.
    - Para sair do JShell, digite /exit.
- Exemplo: Hello World!
    - Vamos começar com o tradicional "Hello World":

System.out.println("Hello, world!");

- Exemplo: Declarando Variáveis:
    - Declare variáveis diretamente no JShell:

int x = 10;
String message = "Olá!";

- Exemplo: Expressões Matemáticas:
    - Execute cálculos diretamente:

int resultado = 2 + 3 * 4;
System.out.println(resultado); // Saída: 14

- Dica: Autocompletar e Ajuda:
    - Pressione a tecla Tab para autocompletar comandos e variáveis.
    - Digite /help para obter ajuda sobre os comandos disponíveis.
O JShell é uma ferramenta valiosa para desenvolvedores Java, especialmente para experimentação e aprendizado. Divirta-se explorando! 😉 .