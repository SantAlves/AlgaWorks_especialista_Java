import java.util.Scanner;
import java.util.Locale;

public class CalculadoraImc {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Digite o peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        //boolean abaixoPesoIdeal = imc < 18.5;

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal. Procure um nutricionista!");
        }
        if (imc >= 18 && imc <= 25) {
            System.out.println("Peso ideal!");
        }
        if (imc >= 25 && imc <= 30) {
            System.out.println("Acima do peso!");
        }
        if (imc >= 30 && imc <=35) {
            System.out.println("Obesidade I");
        }
        if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade II");
        }
        if (imc >= 40) {
            System.out.println("Risco de morte!");
        }
       
        System.out.println("Fim do programa!");


        entrada.close();
    }
}
