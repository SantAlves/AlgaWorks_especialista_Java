public class Aplicacao {
    public static void main(String[] args) throws Exception {
        
        Moto minhaMoto = new Moto();

        // Auterando os valores dos atributos


        minhaMoto.fabricante = "Honda";
        minhaMoto.modelo = "CB 650R";
        minhaMoto.ano = 2020;
        minhaMoto.cilindradas = 120;

        Pessoa donoVeiculo = new Pessoa();
        
        minhaMoto.proprietario = donoVeiculo;

        minhaMoto.proprietario.cpf = 333444;
        minhaMoto.proprietario.idade = 25;
        minhaMoto.proprietario.nome = "Marcos";

        System.out.printf("Fabricante: %s%n", minhaMoto.fabricante);
        System.out.printf("Modelo: %s%n",minhaMoto.modelo);
        System.out.printf("Ano: %d%n", minhaMoto.ano);
        System.out.printf("Cilindradas: %d%n",minhaMoto.cilindradas);
        System.out.println();
        System.out.println("=========== Dados do proprietário da moto  ===============");
        System.out.println();
        System.out.printf("CPF: %d%n",minhaMoto.proprietario.cpf);
        System.out.printf("Idade: %d%n",minhaMoto.proprietario.idade);
        System.out.printf("Nome: %s%n",minhaMoto.proprietario.nome);

        
        
       
    }
}
