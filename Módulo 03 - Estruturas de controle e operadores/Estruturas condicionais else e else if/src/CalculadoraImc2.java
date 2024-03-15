import java.util.Scanner;
import java.util.Locale;

public class CalculadoraImc2 {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Digite o peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        //boolean abaixoPesoIdeal = imc < 18.5;
        System.out.printf("Seu IMC: %.2f%n", imc);
        
        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal. Procure um nutricionista!");
        } else if (imc < 25) {
            System.out.println("Peso ideal!");
        } else if (imc < 30) {
            System.out.println("Acima do peso!");
        } else if (imc < 35) {
            System.out.println("Obesidade I");
        } else if (imc < 40){      
            System.out.println("Obesidade II");
        } else {
            System.out.println("Risco de morte!");
        }
       
        System.out.println("Fim do programa!");


        entrada.close();
    }
}

/*  
   // Uma opção, mas não é uma boa prática!!
        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal. Procure um nutricionista!");
        } else {
            if (imc < 25){
                System.out.println("Peso ideal!");
            } else {
                if (imc < 30){
                    System.out.println("Acima do peso!");
                } else {
                    if (imc < 35){
                        System.out.println("Obesidade I");
                    } else {
                        if (imc < 40){
                            System.out.println("Obesidade II");
                        } else {
                            System.out.println("Risco de morte!");
                        }
                    }
                }
            }
        }
 */