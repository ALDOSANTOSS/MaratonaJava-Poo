package Introduçãoclasses.pratica01;

public class Cliente01 {

    public static void main(String[] args) {
        ContaBanco01 contaCorrente = new ContaBanco01();

        contaCorrente.numConta = 10101010;
        contaCorrente.tipo =  "Corrente";
        contaCorrente.setDono("Pedro");;
        contaCorrente.setSaldo(10.000F);




        ContaBanco01 contaPoupanca = new ContaBanco01();

        contaPoupanca.numConta = 10101010;
        contaPoupanca.tipo = "Poupanca";
        contaPoupanca.setDono("Pedro");
        contaPoupanca.setSaldo(500F);

















    }
}
