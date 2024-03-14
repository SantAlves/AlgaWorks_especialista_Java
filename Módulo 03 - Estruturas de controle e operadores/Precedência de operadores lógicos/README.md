

1. **Operadores Unários**:
   - Os operadores unários atuam em apenas um operando.
   - Exemplos incluem:
     - `++` e `--`: Incremento e decremento.
     - `+` e `-`: Mudança de sinal.
     - `~`: Inversão de bits.
     - `!`: Negação lógica.

2. **Operadores Aritméticos**:
   - Realizam operações matemáticas básicas, como adição, subtração, multiplicação, divisão e módulo.
   - A ordem de avaliação é:
     1. Multiplicação (`*`), divisão (`/`) e módulo (`%`).
     2. Adição (`+`) e subtração (`-`).

3. **Operadores de Deslocamento (Shift)**:
   - São usados para mover os bits de um valor para a esquerda (`<<`) ou direita (`>>`).
   - Eles têm menor precedência que os operadores aritméticos.

4. **Operadores Relacionais e de Igualdade**:
   - Comparam valores e retornam resultados booleanos.
   - Exemplos: `<`, `>`, `<=`, `>=`, `==` e `!=`.

5. **Operadores Bit a Bit (Bitwise)**:
   - Realizam operações bit a bit em números inteiros.
   - Exemplos: `&` (AND), `|` (OR), `^` (XOR).

6. **Operadores Lógicos**:
   - São usados para combinar expressões booleanas.
   - `&&` (E) e `||` (OU) têm menor precedência que os operadores relacionais.

7. **Operador Ternário**:
   - É uma forma concisa de expressar uma decisão.
   - Exemplo: `condicao ? valorVerdadeiro : valorFalso`.

8. **Operadores de Atribuição**:
   - Atribuem valores a variáveis.
   - Exemplos: `=`, `+=`, `-=` etc.

Aqui está um exemplo de uso desses operadores:

\================= java=======================/

      public class ExemploOperadores {
          public static void main(String[] args) {
              int a = 10;
              int b = 5;

              // Operadores aritméticos
              System.out.println(a + b); // 15
              System.out.println(a * b); // 50

              // Operadores lógicos
              boolean condicao1 = true;
              boolean condicao2 = false;
              System.out.println(condicao1 && condicao2); // false

              // Operador ternário
              int maiorValor = (a > b) ? a : b;
              System.out.println("Maior valor: " + maiorValor);
          }
      }

\================================================================/