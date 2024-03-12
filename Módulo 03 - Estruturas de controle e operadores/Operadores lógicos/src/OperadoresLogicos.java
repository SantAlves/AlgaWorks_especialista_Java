import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cortisol: ");
        double cortisol = entrada.nextDouble();

        // Cortisol ideal é de 6 a 18.4
        boolean resultNormal = cortisol >= 6 && cortisol <= 18;

        System.out.printf("Cortisol normal %b%n", resultNormal);

        boolean resultAnormal = cortisol < 6 || cortisol > 18;

        System.out.printf("Cortisol anormal %b%n", resultAnormal);
        entrada.close();
    }
}
