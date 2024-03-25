public class Aplicacao {
    public static void main(String[] args) throws Exception {
        
        Moto minhaMoto = new Moto();

        // Auterando os valores dos atributos
        minhaMoto.fabricante = "Honda";
        minhaMoto.modelo = "CB 650R";
        minhaMoto.ano = 2020;
        minhaMoto.cilindradas = 120;

        System.out.printf("Fabricante: %s%n", minhaMoto.fabricante);
        System.out.printf("Modelo: %s%n",minhaMoto.modelo);
        System.out.printf("Ano: %d%n", minhaMoto.ano);
        System.out.printf("Cilindradas: %d%n",minhaMoto.cilindradas);

        Moto suaMoto = new Moto();
        
       
    }
}
