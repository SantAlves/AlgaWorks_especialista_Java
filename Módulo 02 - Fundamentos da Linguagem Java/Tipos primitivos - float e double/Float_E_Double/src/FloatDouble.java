import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FloatDouble {
    public static void main(String[] args) throws Exception {
        
        float altura = 1.75f; // Altura em metros
        System.out.println("Altura: " + altura);

        double salarioAnual = 75000.50; // Salário anual em dólares
        System.out.println("Salário anual: " + salarioAnual);


        // Configura o Locale para usar vírgula como separador decimal
        Locale locale = new Locale("pt", "BR");

        // Cria um DecimalFormat com o Locale configurado
        DecimalFormat df = new DecimalFormat("#0.00", new DecimalFormatSymbols(locale));

        double valor = 1234.56;
        String valorFormatado = df.format(valor);

        System.out.println("Valor formatado: " + valorFormatado);
    }
}
