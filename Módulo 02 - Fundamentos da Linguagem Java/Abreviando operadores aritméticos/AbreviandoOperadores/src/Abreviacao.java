public class Abreviacao {
    public static void main(String[] args) throws Exception {
        
        int x = 10;
        int y = 5;
        double z = 3.14;

        // Usa abreviação de operadores aritméticos para modificar os valores das variáveis
        x += 2; // Equivalente a x = x + 2
        y -= 1; // Equivalente a y = y - 1
        z *= 2; // Equivalente a z = z * 2

        // Imprime os novos valores das variáveis
        System.out.println("x = " + x); // x = 12
        System.out.println("y = " + y); // y = 4
        System.out.println("z = " + z); // z = 6.28

    }
}
