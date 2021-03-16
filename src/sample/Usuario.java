package sample;

public class Usuario {

    public boolean verificarIdade(int idade){

        if(idade >=18){
            System.out.println("É maior de idade");
            return true;
        } else {
            System.out.println("Não é maior de idade");
            return false;
        }
    }

    public boolean verificarNacionalidade(boolean nacionalidade) {
        if(nacionalidade){
            System.out.println("É brasileiro");
            return true;
        } else {
            System.out.println("Não é brasileiro");
            return false;
        }
    }

    public boolean verificarDisponibilidadeTarde(boolean temDisponibilidadeTarde) {
        if(temDisponibilidadeTarde){
            System.out.println("Tem disponibilidade tarde");
            return true;
        } else {
            System.out.println("Não tem disponibilidade");
            return false;
        }

    }
}

