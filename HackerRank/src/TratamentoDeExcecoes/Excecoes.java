package TratamentoDeExcecoes;

public class Excecoes {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }
    public static void metodo1(){
        System.out.println(">> Inicio do metodo 1");
        metodo2();
        System.out.println(">> Fim do metodo 1");
    }
    public static void metodo2(){
        System.out.println(">>>> Inicio do metodo 2");
    try {
        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) {
            array[i] = i;
            System.out.println("\t" + i);
        }
    }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }
        System.out.println(">>>> Fim do metodo 2");
    }


}
