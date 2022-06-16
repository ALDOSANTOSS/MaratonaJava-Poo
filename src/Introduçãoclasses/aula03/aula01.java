package Introduçãoclasses.aula03;

public class aula01 {

    public static void main(String[] args) {

        Caneta01 c1 = new Caneta01();

        c1.setModelo("BIC");
        // c1.modelo = "Bic";
        c1.setPonta(0.5f);


        System.out.println("Tenho um caneta " + c1.getModelo() +
                " de " + c1.getPonta());

    }


}

