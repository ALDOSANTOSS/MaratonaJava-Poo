package Introduçãoclasses.test;

import Introduçãoclasses.dominio.Pessoa;

public class PessoaTest1 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Pedro";
        pessoa.idade = 23;
        pessoa.sexo = 'F';

        System.out.println(pessoa.idade);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);


    }
}

