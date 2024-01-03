package aula08;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(
                "Everton",
                26,
                "M"
        );
        Pessoa pessoa2 = new Pessoa(
                "Manu",
                24,
                "F"
        );
        Livro livro1 = new Livro(
                "Harry Potter e a Pedra Filosofal",
                "J. K. Rowling",
                208,
                pessoa1
        );
        Livro livro2 = new Livro(
                "Guerra dos Tronos - As cronicas de gelo e fogo",
                "George R.R. Martin",
                587,
                pessoa2
        );
        livro1.abrir();
        //livro1.avancarPag();
        livro1.folhear(5);
        //livro1.fechar();
        pessoa1.fazerNiver();
        System.out.println(livro1.toString());
        livro2.folhear(154);
        livro2.avancarPag();
        pessoa2.fazerNiver();
        System.out.println(livro2.toString());
    }
}
