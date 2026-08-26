package Aula.att_sala;
import java.util.Scanner;
public class Tempo {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor da Hora inicial: ");
        int Hi = scan.nextInt();
        System.out.print("Digite o valor do Minuto Inicial: ");
        int Mi = scan.nextInt();
        System.out.print("Digite o valor da Hora final: ");
        int Hf = scan.nextInt();
        System.out.print("Digite o valor do Minuto Final: ");
        int Mf = scan.nextInt();

        int HorasT = Hf - Hi;
        int MinutosT = Mf- Mi;

        System.out.print("O jogo durou " + HorasT + " horas e " + MinutosT + " minutos");


    }

}
