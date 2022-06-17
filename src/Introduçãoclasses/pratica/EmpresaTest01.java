package Introduçãoclasses.pratica;

public class EmpresaTest01 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.trabalho = "Todos";
        empresa.refeitorio = "Todos";
        empresa.setRh("Só o rh");
        System.out.println("Só pessoas do rh " + empresa.getRh() );



    }
}
