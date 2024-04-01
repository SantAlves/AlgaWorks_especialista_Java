public class Livro {

  String nome;
  double valor;
  String isbn;
  int anoLancamento;
  Autor autor;

  void mostrarDetalhes() {
    
    String mensagem = "********* DETALHES DO LIVRO *********";
    System.out.println("\n\n=====================================\n");
    System.out.println(mensagem);
    System.out.println("Nome: " + nome);
    System.out.println("Valor: R$ " + valor);
    System.out.println("ISBN: " + isbn);
    System.out.println("Ano de lançamento: " + anoLancamento);
    autor.mostrarDetalhes();
    System.out.println("\n\n=====================================\n");

  }

}
