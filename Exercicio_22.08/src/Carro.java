public class Carro {
    String marca;
    String modelo;
    int ano;
    Motor motor;

    void mostrarDetalhes(){
        String mensagem = "Detalhes do carro";
        System.out.println("---");
        System.out.println(mensagem);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("---");
        motor.mostrarDetalhes();
        System.out.println("---");
    }
}
