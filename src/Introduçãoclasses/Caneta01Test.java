package Introduçãoclasses;

public class Caneta01Test {

    public static void main(String[] args) {
        Caneta01 c1 = new Caneta01();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();

        Caneta01 c2 = new Caneta01();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();



    }
}
