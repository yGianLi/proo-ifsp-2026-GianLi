package singleton;

// A classe ConexaoBanco implementa o padrão de projeto Singleton

public class ConexaoBanco {
    private static ConexaoBanco conexao;

    private ConexaoBanco(){
        System.out.println("Conexão criada...");

    }

    public static ConexaoBanco getInstance(){
        if (conexao == null){
            conexao = new ConexaoBanco();
        }else{ // apenas para ver o padrão funcionando
            System.out.println("Usando a mesma instância...");
        }
        return conexao;
    }

}
