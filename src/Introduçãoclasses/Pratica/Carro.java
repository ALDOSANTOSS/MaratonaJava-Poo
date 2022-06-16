package Introduçãoclasses.Pratica;

public class Carro {

    String nome;
    String cor;
    int ano;
    boolean andando;

    void status() {
        System.out.println("Qual  o nome " + this.nome);
        System.out.println("Qual o ano" + this.ano);
        System.out.println("E a cor" + this.cor);
        System.out.println("Esta andando?" + this.andando);

    }

    void emMovimento() {

        if (this.andando == true) {

            System.out.println("Veiculo em movimento");

        } else {
            System.out.println("Esta parado");
        }

    }


    void parado() {

    }

}
