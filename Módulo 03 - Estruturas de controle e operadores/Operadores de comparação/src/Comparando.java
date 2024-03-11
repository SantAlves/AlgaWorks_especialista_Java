public class Comparando {
    public static void main(String[] args) throws Exception {
        
        int pesoDosProdutos = 600;
        int limitePesoCaminhao = 900;
        boolean cargaExcedida = pesoDosProdutos > limitePesoCaminhao;
        
        System.out.printf("Peso dos Produtos: %d%n",pesoDosProdutos);
        System.out.printf("Limite Peso Caminhao: %d%n",limitePesoCaminhao);
        System.out.printf("Carga Excedida: %b%n",cargaExcedida);

    }
}
