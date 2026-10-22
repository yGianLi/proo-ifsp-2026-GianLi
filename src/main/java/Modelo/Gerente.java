package Modelo;

public class Gerente extends Funcionario{
    private int numeroDeFuncionarios;
    private double bonus;

    public Gerente(String nome, String cpf, double salario, int funcionarios){
        // chamando o construtor da classe mãe
        super(nome, cpf, salario);
        this.numeroDeFuncionarios = funcionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public double getBonus() {
        double bonus = 0.10;
        if(numeroDeFuncionarios >= 50){
            bonus = 0.20;
        }
        return bonus;
    }

    @Override
    public String toString(){
        String mensagem = super.toString();
        return "Gerente: \n" + mensagem + "\nNum. funcionarios: " + numeroDeFuncionarios;
    }
    @Override
    public double getSalario(){
        double salario = super.getSalario();
        double valorBonus = getBonus() * salario;
        return (salario + valorBonus);
    }



}
