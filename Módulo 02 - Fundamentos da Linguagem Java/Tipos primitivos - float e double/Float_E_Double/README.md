Float:

O tipo float é usado para representar números de ponto flutuante com precisão simples. Ele ocupa 32 bits de memória e pode armazenar valores na faixa de 1.4E-45 a 3.4028235E38.
Exemplo de declaração e inicialização de uma variável float:

public class ExemploFloat {
    public static void main(String[] args) {
        float altura = 1.75f; // Altura em metros
        System.out.println("Altura: " + altura);
    }
}


Observação: Note o sufixo f após o valor 1.75. Isso é necessário para indicar que o número é do tipo float. Caso contrário, o Java consideraria o valor como double.

-------------------------------------------------------------------

Double:

O tipo double é usado para representar números de ponto flutuante com precisão dupla. Ele ocupa 64 bits de memória e pode armazenar valores na faixa de 4.9E-324 a 1.7976931348623157E308.
Exemplo de declaração e inicialização de uma variável double:


public class ExemploDouble {
    public static void main(String[] args) {
        double salarioAnual = 75000.50; // Salário anual em dólares
        System.out.println("Salário anual: " + salarioAnual);
    }
}

Observação: No caso do double, não é necessário usar um sufixo específico, pois o Java assume que valores com ponto decimal são do tipo double.


Notação com Pontos e Vírgulas:

Em Java, a notação para números de ponto flutuante utiliza ponto como separador decimal, não vírgula. Portanto, use 1.75 em vez de 1,75.

Se você usar vírgula como separador decimal, o Java considerará o valor como uma sequência de caracteres e não como um número.

MAAAAAASSSSS...

E se eu quiser usar a vírgula como separador decimal?

Usando o Locale Padrão:

Por padrão, o Java usa o Locale do sistema operacional. Se o seu sistema estiver configurado para usar vírgula como separador decimal (por exemplo, em alguns países europeus), o Java também usará a vírgula.

No entanto, isso pode variar dependendo do ambiente em que seu código está sendo executado.
Definindo Explicitamente o Locale:

Você pode definir explicitamente o Locale no seu código Java. Por exemplo, para usar a vírgula como separador decimal, você pode fazer o seguinte:

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ExemploLocale {
    public static void main(String[] args) {
        // Configura o Locale para usar vírgula como separador decimal
        Locale locale = new Locale("pt", "BR");

        // Cria um DecimalFormat com o Locale configurado
        DecimalFormat df = new DecimalFormat("#0.00", new DecimalFormatSymbols(locale));

        double valor = 1234.56;
        String valorFormatado = df.format(valor);

        System.out.println("Valor formatado: " + valorFormatado);
    }
}


Neste exemplo, o Locale("pt", "BR") especifica o português do Brasil, que usa a vírgula como separador decimal.

Observação sobre Entrada de Usuário:

Se o seu programa aceitar entrada de usuário (por exemplo, através do teclado), lembre-se de que diferentes usuários podem usar diferentes convenções de separador decimal. Portanto, é importante validar e converter adequadamente os valores de entrada.