package Introduçãoclasses.Pratica;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.nome = "Gol";
        c1.cor = "Preto";
        c1.ano = 2000;
        c1.andando = false;
        c1.status();
        c1.emMovimento();
        c1.parado();


    }
}
