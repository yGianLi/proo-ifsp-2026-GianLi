package exercicios.exerciciospt2revisao;

public class ExtratorEmail {
    public static void main(String[] args) {
        String email = "joao.silva@ifsp.edu.br";
        //String email = "joao.silva@gmai.com";

        int posicaoArroba = email.indexOf('@');

        String usuario = email.substring(0, posicaoArroba);

        String dominio = email.substring(posicaoArroba + 1);

        System.out.println("Usuário: " + usuario);
        System.out.println("Domínio: " + dominio);

        if (dominio.contains("ifsp")) {
            System.out.println("E-mail institucional");
        } else {
            System.out.println("E-mail externo");
        }
    }
}
