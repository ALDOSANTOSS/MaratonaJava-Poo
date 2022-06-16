package Introduçãoclasses.aula02;

public class Aula01 {
    public static void main(String[] args) {

        Caneta01 c1 = new Caneta01();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5;
        c1.carga = 80;
        // c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();


    }
}
