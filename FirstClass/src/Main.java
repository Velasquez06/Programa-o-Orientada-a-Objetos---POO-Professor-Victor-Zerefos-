public class Main{
    public static void main(String[] args){

        // Criando autor
        Autor autor = new Autor();
        autor.nome = "J.R.R. Tolkien";
        autor.email = "jrrtolkien@gmail.com";
        autor.cpf = "123.456.789-00";

        // Crinado Livro
        Livro livro = new Livro();
        System.out.println();
        livro.nome = "O senhor dos Anéis";
        livro.descricao = "Uma história de fantasia";
        livro.valor = 200.0;
        livro.isbn = "123-456-78-9";

        livro.autor = autor;
        livro.mostrarDetalhes();

        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println();


        // Criando outro autor
        Autor outroAutor = new Autor();
        outroAutor.nome = "Antonie de Saint-Exupéry";
        outroAutor.email = "antonie@gmail.com";
        outroAutor.cpf = "123.456.789-00";

        // Criando outro Livro
        Livro outroLivro = new Livro();

        outroLivro.nome = "O pequeno Príncipe";
        outroLivro.descricao = "Uma história de fantasia 2";
        outroLivro.valor = 100.0;
        outroLivro.isbn = "123-456-78-9";

        outroLivro.autor = outroAutor;
        outroLivro.mostrarDetalhes();
    }
}