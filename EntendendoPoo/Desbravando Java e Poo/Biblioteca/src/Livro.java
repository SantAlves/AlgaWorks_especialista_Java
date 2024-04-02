public class Livro {

  String nome;
  double valor;
  String isbn;
  int anoLancamento;
  Autor autor;
  boolean temAutor;
  

  void mostrarDetalhes() {
    
    String mensagem = "********* DETALHES DO LIVRO *********";
    System.out.println("\n\n=====================================\n");
    System.out.println(mensagem);
    System.out.println("Nome: " + nome);
    System.out.println("Valor: R$ " + valor);
    System.out.println("ISBN: " + isbn);
    System.out.println("Ano de lançamento: " + anoLancamento);

    if(this.temAutor()){
      autor.mostrarDetalhes();
    }else{
      System.out.println("Sem autor");
    }
    
    System.out.println("\n\n=====================================\n");
  }

  public void aplicarDescontoDe(double porcentagem){
    this.valor -= this.valor * porcentagem;

    System.out.println("Valor com desconto: R$ " + valor);
  }

  boolean temAutor(){
    return this.autor != null;
  }

 

}
