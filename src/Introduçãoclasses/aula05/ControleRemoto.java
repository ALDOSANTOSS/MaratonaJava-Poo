package Introduçãoclasses.aula05;

public class ControleRemoto implements Controlador {

    private int volune;
    private boolean ligado;
    private boolean tocando;

    private int getVolune() {
        return volune;
    }

    private void setVolune(int volune) {
        this.volune = volune;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    ControleRemoto() {

    }

    public ControleRemoto(int volune, boolean ligado, boolean tocando) {
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
        for (int i = 0; i <= this.getVolune(); i += 10) {
            System.out.println("[]");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu ....");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolune(this.getVolune() + 5);

        }
    }


    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolune(getVolune() - 5);
        }

    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolune() > 0){
            this.setVolune(0);
        }


    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() &&  this.getVolune() == 0){
            this.setVolune(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }

    }
}

