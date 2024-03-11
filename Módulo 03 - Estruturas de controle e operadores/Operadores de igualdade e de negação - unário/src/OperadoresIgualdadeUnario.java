public class OperadoresIgualdadeUnario {
    public static void main(String[] args) throws Exception {
        
        //boolean numerosIguais = 10 ==10;
        
        //boolean numerosIguais = (2-1) ==(2+8);

        int numero1 = 10;
        int numero2 = 11;
        boolean numerosIguais = numero1 == numero2;
        // boolean numerosDiferentes = !numerosIguais; // ou  boolean numerosDiferentes = !(numero1 == numero2);
        boolean numerosDiferentes = numero1 != numero2;

        System.out.printf("Numero %d é = Numero %d? ", numero1, numero2);
        System.out.println("Resultado: " + numerosIguais);
        System.out.println("Negando a resposta com o operador de negação -> ! : " + numerosDiferentes);
    }
}
