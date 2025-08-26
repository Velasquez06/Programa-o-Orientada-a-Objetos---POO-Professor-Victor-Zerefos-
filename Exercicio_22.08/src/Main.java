public class Main{
    public static void main(String[] args){

        //Criando o motor
        Motor motor = new Motor();
        motor.tipoCombustivel = "Gasolina";
        motor.potencia = 100;

        //Criando carro
        Carro carro = new Carro();
        carro.marca = "Volkswagen";
        carro.modelo = "Gol";
        carro.ano = 2004;

        carro.motor = motor;
        carro.mostrarDetalhes();

        System.out.println("_________________________________");

        //Criando segundo motor
        Motor outroMotor = new Motor();
        outroMotor.tipoCombustivel = "Álcool";
        outroMotor.potencia = 70;

        //Criado outro carro
        Carro outroCarro = new Carro();
        outroCarro.marca = "Volkswagen";
        outroCarro.modelo = "Chevette";
        outroCarro.ano = 1970;

        outroCarro.motor = outroMotor;
        outroCarro.mostrarDetalhes();


    }
}