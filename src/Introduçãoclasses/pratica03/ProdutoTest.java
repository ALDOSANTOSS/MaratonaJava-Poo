package Introduçãoclasses.pratica03;

public class ProdutoTest {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;
        Produto p2 = new Produto("Caneta Preta","Fabre");
        p2.valor = 1.04f;
        Produto p3 = new Produto("Caneta Azul","Grafite",10.3F);
        // P1
        System.out.println("Nome:" + p1.nome + "Marca: " + p1.marca + "Valor: " + p1.valor);
        // P2
        System.out.println("Nome:" + p2.nome + "Marca: " + p2.marca + "Valor: " + p2.valor);
        // P3
        System.out.println("Nome:" + p3.nome + "Marca: " + p3.marca + "Valor: " + p3.valor);



    }
}
