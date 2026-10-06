package exercicios.exerciciospt2revisao;

public class ValidadorCadastro {
    public static void main(String[] args) {
        String nomeDigitado = " maria ";
        String t1 = nomeDigitado.trim();

        System.out.println(t1);
        if(t1.isEmpty()){
            System.out.println("Nome Invalido!");
        }else{
            System.out.println(t1.toUpperCase());
            System.out.println(t1.length());
        }


    }

}
