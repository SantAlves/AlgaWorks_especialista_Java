Em Java, uma sequência de escape é um conjunto de caracteres que começa com uma barra invertida (\\) seguida por outro caractere. Essas sequências têm significados especiais dentro da linguagem de programação e são usadas para realizar tarefas específicas. Vamos explorar algumas delas:
- Escape de aspas duplas (\"): Quando você deseja incluir aspas duplas dentro de uma string, use a sequência \". Por exemplo:

System.out.println("Olá, \"mundo\"!");
// Saída: Olá, "mundo"!

- Escape de barra invertida (\\): Para exibir uma barra invertida como saída, utilize \\. Por exemplo:

System.out.println("Caminho do arquivo: C:\\diretorio\\arquivo.txt");
// Saída: Caminho do arquivo: C:\diretorio\arquivo.txt

- Escape de nova linha (\\n): Insere uma quebra de linha na string. Por exemplo:

System.out.println("Linha 1\nLinha 2");
// Saída:
// Linha 1
// Linha 2

- Escape de tabulação (\\t): Adiciona um caractere de tabulação entre palavras. Por exemplo:

System.out.println("Bom dia\\tGeeks!");
// Saída: Bom dia    Geeks!

- Escape de retorno de carro (\\r): Move o cursor de saída para o início da linha. Menos comum, mas útil em alguns contextos.
- Escape de barra de espaço (\\b): Representa um caractere de retrocesso (backspace). Ele move o cursor uma posição para trás.
- Escape de caractere Unicode (\\u): Permite representar caracteres Unicode em strings. Por exemplo:

System.out.println("Símbolo de coração: \u2764");
// Saída: Símbolo de coração: ❤

Essas sequências de escape são essenciais para manipular caracteres especiais e garantir que o compilador interprete corretamente o texto dentro das strings   .