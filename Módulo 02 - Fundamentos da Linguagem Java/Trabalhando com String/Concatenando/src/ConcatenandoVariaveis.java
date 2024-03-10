public class ConcatenandoVariaveis {
    public static void main(String[] args) throws Exception {

        int x = 10;
        int y = 5;
        String nome = "Isaias";
        int idade = 25;

        System.out.println();
        System.out.println("Concatenou primeiro " + x + y);
        System.out.println();
        System.out.println(x + y + " Fez a operação e depois concatenou!");
        System.out.println();
        System.out.println("Concatenou primeiro " + (x + y) + "\n");
        System.out.println("Oi, meu nome é " + nome + " e tenho " + idade + " anos\n\n");

    }
}
