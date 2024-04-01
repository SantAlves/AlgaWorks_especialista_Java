import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        Paciente paciente = new Paciente();
        paciente.altura = altura;
        paciente.peso = peso;

        IndiceMassaCorporal imc = paciente.calcularIndiceDeMassaCorporal();

        if (imc.resultado >= 30) {
            System.out.printf("\n\nAltura: %.2f ; Peso: %.2f. Procure um nutricionista!", imc.altura, imc.peso);
        }

        System.out.printf("\nIMC = %.2f%n", imc.resultado);

        scanner.close();
    }
}
