public class OrdemDePrecedencia {
    public static void main(String[] args) throws Exception {
        int numero_1 = 19;
        int numero_2 = 20;
        
        //boolean result = numero_1 == 19 && ( numero_1 == 18 || numero_2 == 20);
        boolean result = (numero_1 == 19 && numero_1 == 18) || numero_2 == 20;

        System.out.println(result);
        
          
    }
}
