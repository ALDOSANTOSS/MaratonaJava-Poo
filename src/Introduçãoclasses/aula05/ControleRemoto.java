package Introduçãoclasses.aula05;

public class ControleRemoto implements Controlador {

    private int volune;
    private boolean ligado;
    private boolean tocando;

    public int getVolune() {
        return volune;
    }

    public void setVolune(int volune) {
        this.volune = volune;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public ControleRemoto(){

    }

    public ControleRemoto(int volune,boolean ligado,boolean tocando){
        this.volune = 50;
        this.ligado = false;
        this.tocando = false;
    }


    @Override
    public void ligar() {
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolune());
        for (int i = 0; i <= this.getVolune(); i+=10){
            System.out.println("[]");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu ....");

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}

