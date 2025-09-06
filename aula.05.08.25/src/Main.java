public class Main {
    public static void main(String[] args) {

        //aula3

        Autor autor = new Autor();
        autor.setNomeAutor("J.R.R Tolkien");
        autor.setEmailAutor("jrrtolkien@gmail.com");
        autor.setCPFAutor("123.456.789-00");

        Autor autorEbook = new Autor();
        autorEbook.setNomeAutor("---NOME AUTOR EBOOK");
        autorEbook.setCPFAutor("123;123;123;12");
        autorEbook.setEmailAutor("autor@gmail.com");


        Livro livro = new Livro(autor);
        livro.setNome("O Senhor dos Anéis.");
        livro.setDescricao("Uma história de fantasia medieval.");
        livro.setValor(200);
        livro.setIsbn("123-456-78-9");

        Ebook ebook = new Ebook(autor);
        ebook.setNome("aruanda");
        ebook.setDescricao("livro sobre aruanda");
        ebook.setIsbn("123.123.123.123");
        ebook.setValor(125);
        ebook.setAutor(autorEbook);
        ebook.setWatermark("autor do ebook");

        livro.setAutor(autor);


        livro.mostrarDetalhes();

        livro.aplicarDescontoDe(20);

        System.out.println("O livro agora custa: " + livro.getValor());
        System.out.println(livro.temAutor());}
}