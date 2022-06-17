package Introduçãoclasses.Pratica;

public class Lampada {

    public String modelo;
    public String tensao;
    public int potencia;
    public String cor;
    public String tipoLuz;
    public int garantiaMeses;
    public String[] tipos;
    public boolean tipoAbajur;
    public boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
         ligada = false;
    }

    void mostraEstado(){
        if (ligada){
            System.out.println("Está ligada");
        } else {
            System.out.println("Esta desligada");
        }
    }

    void mudarEstado(){
        if (ligada){
            desligar();
        }else {
            ligar();
        }
    }


}
