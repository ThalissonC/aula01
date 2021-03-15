package sample;

public class metodo {
    public static void main(String[] args){
        int idade = 19;
        boolean resultado = verificarMaiorIdade(idade);
        System.out.println(resultado);
    }

    private static boolean verificarMaiorIdade(int idade) {
        if (idade >= 18){
            System.out.println("Ele é maior de idade");
            return true;
        } else {
            System.out.println("Ele é menor de idade");
            return false;
        }
    }
}
