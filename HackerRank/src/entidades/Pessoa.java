package entidades;

public class Pessoa {
    private String nome;   /* private não deixa mudar o dado dentro do objeto, já public pode ser alterada*/
    private int idade;
    private String ultimoNome;

    public void alterarIdade(int i){
        if( i >= 0 && i <= 120){
            idade = i;
        }
    }

    private void dividirString(String texto){
        String [] nomes = texto.split(" ");
        nome = nomes[0];
        ultimoNome = nomes[1];

    }

    public void alterarNome(String novoNome){
        if(novoNome == null || novoNome.isBlank()){
            // System.err.println("Campo novoNome Vazio ou nulo!!");
            throw new IllegalArgumentException("Campo novoNome Vazio ou nulo!!");
        }
        dividirString(novoNome);
    }
    public String qualSeuNome(){
            return nome.toUpperCase();
    }
    public int qualSuaIdade(){
        return idade;
    }
    public String qualUltimoNome(){
        return ultimoNome;
    }

}
