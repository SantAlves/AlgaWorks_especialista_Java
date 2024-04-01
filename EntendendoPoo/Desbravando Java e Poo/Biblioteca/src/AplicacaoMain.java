import java.util.Scanner;

public class AplicacaoMain {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        // Variávis contendo os dados do livro
        String nome;
        double valor;
        String isbn;
        int anoLancamento;
        
        //Variáveis contebdo os dados do autor
        String nomeAutor;
        int idadeAutor;
        String emailAutor;

        
        System.out.print("Nome do livro: ");
        nome = entrada.nextLine();

        System.out.print("Valor do livro: ");
        valor = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("ISBN do livro: ");
        isbn = entrada.nextLine();
        
        System.out.print("Ano de laçamento do livro: ");
        anoLancamento = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Nome do autor: ");
        nomeAutor = entrada.nextLine();

        System.out.print("Idade do autor: ");
        idadeAutor = entrada.nextInt();
        entrada.nextLine();

        System.out.print("E-mail do autor: ");
        emailAutor = entrada.nextLine();

        Livro livro1Livro = new Livro();

        livro1Livro.nome = nome;
        livro1Livro.valor = valor;
        livro1Livro.isbn = isbn;
        livro1Livro.anoLancamento = anoLancamento;

        Autor autor1Autor = new Autor();

        autor1Autor.nomeAutor = nomeAutor;
        autor1Autor.idadeAutor = idadeAutor;
        autor1Autor.emailAutor = emailAutor;

        livro1Livro.autor = autor1Autor;

        livro1Livro.mostrarDetalhes();

       


        entrada.close();
    }
}
