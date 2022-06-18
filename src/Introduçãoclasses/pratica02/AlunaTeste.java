package Introduçãoclasses.pratica02;

public class AlunaTeste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Lucas";
        aluno.idade = 21;
        aluno.curso = "Medicina";
        aluno.assitirAula();
        aluno.fazerProva();
        aluno.calcularNota();

    }
}
