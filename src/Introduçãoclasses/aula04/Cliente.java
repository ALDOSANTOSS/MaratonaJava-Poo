package Introduçãoclasses.aula04;

import Introduçãoclasses.pratica01.ContaBanco01;

public class Cliente {
    public static void main(String[] args) {
        ContaBanco pessoa01 = new ContaBanco();
        pessoa01.setNumConta(111);
        pessoa01.setDono("Jubileu");
        pessoa01.abrirConta("CC");
        pessoa01.estadoAtual();


    }
}
