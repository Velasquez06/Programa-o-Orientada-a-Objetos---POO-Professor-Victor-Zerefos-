public class Autor {
    String nome;
    String email;
    String cpf;

    void mostrarDetalhes(){
        String mensagem = "Informação do Autor: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}

