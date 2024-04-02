public class Autor {
  
  String nomeAutor;
  int idadeAutor;
  String emailAutor;


  void mostrarDetalhes() {

    String mensagem = "\n********* DETALHES DO AUTOR *********";
    
    System.out.println(mensagem);
    System.out.println("\nNome do autor: " + nomeAutor);
    System.out.println("Idade do autor: " + nomeAutor);
    System.out.println("E-mail do autor: " + emailAutor);
  }

}
