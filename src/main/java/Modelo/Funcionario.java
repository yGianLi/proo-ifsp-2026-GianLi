package Modelo;


// Classe Base
public class Funcionario extends Object{
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    public Funcionario(){
        // this invoca o construtor parametrizado
        this("Funcionario", "999", 2000.0);
    }

    public double getsalarioBase() {
        return salarioBase;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String toString(){
        String mensagem = "Nome: " + this.nome + "; cpf: " + this.cpf;
        return mensagem;
    }




}
