package Introduçãoclasses.pratica03;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Gol";
        carro01.marca = "volkswagen";
        carro01.ano = 2022;
        carro01.vel = 0;
        carro01.acelerar(100);
        System.out.println("Velocidade no momento " + carro01.vel + " Km/h");
        carro01.freiar(30);
        System.out.println("Velocidade no momento " + carro01.vel + " km/h");
        carro01.buzinar();

    }
}

