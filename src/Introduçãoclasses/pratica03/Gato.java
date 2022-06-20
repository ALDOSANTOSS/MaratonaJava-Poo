package Introduçãoclasses.pratica03;

public class Gato {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0  && idade < 15){
            this.idade = idade;
            System.out.println("Idade certa");


        }else {
            System.out.println("Idade invalida");

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}


