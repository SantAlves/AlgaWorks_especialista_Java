public class IncreDecre {
    public static void main(String[] args) throws Exception {
       
        // Declara e inicializa algumas variáveis
        int x = 10;
        int y = 5;

        System.out.println("// Usa operadores de incremento e decremento pré-fixados");
        System.out.println("++x = " + ++x); // Imprime 11, pois x é incrementado antes de ser impresso
        System.out.println("--y = " + --y); // Imprime 4, pois y é decrementado antes de ser impresso

        
        System.out.println("// Usa operadores de incremento e decremento pós-fixados");
        System.out.println("x++ = " + x++); // Imprime 11, pois x é impresso antes de ser incrementado
        System.out.println("y-- = " + y--); // Imprime 4, pois y é impresso antes de ser decrementado

        
        System.out.println("// Imprime os valores finais das variáveis");
        System.out.println("x = " + x); // Imprime 12, pois x foi incrementado duas vezes
        System.out.println("y = " + y); // Imprime 3, pois y foi decrementado duas vezes

    }
}
