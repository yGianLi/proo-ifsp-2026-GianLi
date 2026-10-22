package ExerciciosHeranca;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gian", "12312312312", 1800.00, 2);

        System.out.println(gerente.getNumeroFuncionarios());
        System.out.println("Bônus: "+ gerente.calcularBonus());
        System.out.println("Salario com Bônus: "+ gerente.SalarioComBonus());
    }

}