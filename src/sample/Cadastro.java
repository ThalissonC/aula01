package sample;

public class Cadastro {
    public static void main(String[] args) {
        int idade = 19;
        String nacionalidade = "brasileiro";
        String disponibilidade = "tarde";

        if (idade >= 18 && idade <= 60) {
            if (nacionalidade == "brasileiro") {
                if (disponibilidade == "tarde") {

                } else {
                    System.out.println("Não foi possível realizar o cadastro pois você não tem disponibildade no tempo da tarde");
                }
            } else {
                System.out.println("Não foi possível realizar o cadastro pois sua nacionalidade não é brasileiro");
            }
        } else {
            System.out.println("Não foi possível realizar o cadastro pois sua idade não atende aos requisitos mínimos");
        }
        System.out.println("Cadastro realizado com sucesso");
    }
}