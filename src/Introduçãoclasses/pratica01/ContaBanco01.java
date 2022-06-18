package Introduçãoclasses.pratica01;

public class ContaBanco01 {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private boolean abrir;
    private boolean retirar;

    private Float valorMensal;


    public void abrirConta(String cc) {
        this.abrir = true;

    }

    public void fecharConta() {
        this.abrir = false;

    }

    public void depositar() {
        this.retirar = true;

    }

    public void sacar() {
        this.retirar = false;

    }

    public void pagarMensal() {
       valorMensal = valorMensal;

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void estadoAtual() {
    }
}
