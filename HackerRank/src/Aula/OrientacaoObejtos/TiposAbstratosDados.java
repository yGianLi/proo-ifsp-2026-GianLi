package Aula.OrientacaoObejtos;

import java.util.ArrayList;

public class TiposAbstratosDados {
    public static void main(String[] args) {
        //inicializando os jogadores
        Jogador jogador1 = new Jogador();
        jogador1.nome = "Tanjiro";
        System.out.println(jogador1.nome);
        jogador1.destreza = 10;
        System.out.println(jogador1.destreza);
        // jogador 2 é uma váriavel de inst ância (objeto)
        Jogador jogador2 = new Jogador();
        jogador2.nome = "Zoro";
        System.out.println(jogador2.nome);
        jogador2.destreza = 20;
        System.out.println(jogador2.destreza);

        //inicializando o array
        ArrayList<Jogador> timeA = new ArrayList<>();
        timeA.add(jogador1);
        timeA.add(new Jogador());
    }
}
