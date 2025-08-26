public class Motor {
    String tipoCombustivel;
    int potencia;

    void mostrarDetalhes(){
        String mensagem = "Detalhes do motor";
        System.out.println(mensagem);
        System.out.println("Tipo do Combustível: " + tipoCombustivel);
        System.out.println("Potência: " + potencia);
    }

}
