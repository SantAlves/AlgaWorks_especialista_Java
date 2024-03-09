public class ConversaoLongParaInt {
    public static void main(String[] args) throws Exception {
        
        long x = 10;
        /*
        Se esta variável não estivesse comentada, não iria compilar, pois há um erro de casting;

        int y = x;
        
        */

        int y = (int) x; // correção do erro de casting; Mas pode haver perda de infomação.

        System.out.println("Valor de y = x : " + y);

        long a = 9300000035L;
        int b = (int) a;

        System.out.println("Valor de a -> 9300000035L ");
        System.out.println("a = b (note que vai dar um valor completamente diferente, pois há perda de informação na converçao:)");
        System.out.println("Valor de b = a : " + b);
        System.out.println("obs: caso seja de int para long, há uma conversção automatica!");
    }
}
