package Introduçãoclasses.pratica01;

public class Cliente02 {
    public static void main(String[] args) {

        ContaBanco01 contaCorrente = new ContaBanco01();
        contaCorrente.numConta = 20202020;
        contaCorrente.tipo = "Corrente";
        contaCorrente.setDono("Lucas");
        contaCorrente.setSaldo(2000f);

        ContaBanco01 contaPoupanca = new ContaBanco01();

        contaPoupanca.numConta = 20202020;
        contaPoupanca.tipo = "Poupanca";
        contaPoupanca.setDono("Lucas");
        contaPoupanca.setSaldo(5000F);












    }
}
