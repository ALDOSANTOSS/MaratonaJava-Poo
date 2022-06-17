package Introduçãoclasses.Pratica;

public class EmpresaTest01 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.trabalo = "Todos";
        empresa.refeitorio = "Todos";
        empresa.setRh("Só o rh");
        System.out.println("Só pessoas do rh " + empresa.getRh() );



    }
}
