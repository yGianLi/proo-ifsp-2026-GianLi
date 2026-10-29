package abstrata;

public class TesteVeiculo {
    static void main(String[] args) {
        Carro c = new Carro();
        Veiculo v = c;
        v.acelerar();

        //Veiculo v = new Veiculo();
    }
}
