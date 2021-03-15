package sample;

public class Metodo2 {
    public static void main(String[] args) {
        int idade = 17;
        boolean brasileiro = true;
        boolean temDisponibilidadeTarde = true;


        cadastrar(idade, brasileiro, temDisponibilidadeTarde);
    }
        private static void cadastrar (int idade, boolean brasileiro, boolean temDisponibilidadeTarde){
            if (verificarMaiorIdade(idade)) {
                if (verificarDisponibilidadeTarde(temDisponibilidadeTarde)) {
                    if (verificarNacionalidade(brasileiro)) {
                        System.out.println("Parabens cadastro realizado");
                    } else {
                        System.out.println("Não foi possivel cadastrar");
                    }
                }
            }
        }


        private static boolean verificarDisponibilidadeTarde ( boolean temDisponibilidadeTarde){
            if (temDisponibilidadeTarde) {
                System.out.println("Tem tempo disponível a tarde");
                return true;
            } else {
                System.out.println("Tem tempo disponível a tarde");
                return false;
            }
        }

        private static boolean verificarNacionalidade ( boolean brasileiro){
            if (brasileiro) {
                System.out.println("É Brasileiro");
                return true;
            } else {
                System.out.println("Não é Brasileiro");
                return false;
            }
        }

        private static boolean verificarMaiorIdade (int idade){
            if (idade >= 18) {
                System.out.println("É maior de idade");
                return true;

            } else {
                System.out.println("Ele é menor de idade");
                return false;

            }
        }
    }
}
