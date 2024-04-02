import java.util.Scanner;

public class AplicacaoMain {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        // Variáveis contendo os dados do livro
        String nome;
        double valor;
        String isbn;
        int anoLancamento;
        
        // Variáveis contendo os dados do autor
        String nomeAutor = null;
        int idadeAutor = 0;
        String emailAutor = null;
        
        // Perguntar se há um autor
        System.out.print("O livro possui autor? (s/n): ");
        String resposta = entrada.nextLine().toLowerCase();
        
        if (resposta.equals("s")) {
            System.out.print("Nome do autor: ");
            nomeAutor = entrada.nextLine();

            System.out.print("Idade do autor: ");
            idadeAutor = entrada.nextInt();
            entrada.nextLine();

            System.out.print("E-mail do autor: ");
            emailAutor = entrada.nextLine();
        }

        System.out.print("Nome do livro: ");
        nome = entrada.nextLine();

        System.out.print("Valor do livro: ");
        valor = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("ISBN do livro: ");
        isbn = entrada.nextLine();
        
        System.out.print("Ano de lançamento do livro: ");
        anoLancamento = entrada.nextInt();
        entrada.nextLine();

        Livro livroPri = new Livro();

        livroPri.nome = nome;
        livroPri.valor = valor;
        livroPri.isbn = isbn;
        livroPri.anoLancamento = anoLancamento;

        // Verifica se os dados do autor foram fornecidos e instancia o autor
        if (nomeAutor != null && emailAutor != null) {
            Autor autorPri = new Autor();
            autorPri.nomeAutor = nomeAutor;
            autorPri.idadeAutor = idadeAutor;
            autorPri.emailAutor = emailAutor;
            livroPri.autor = autorPri;
        }

        livroPri.mostrarDetalhes();
        livroPri.aplicarDescontoDe(0.3);

        entrada.close();
    }
}
